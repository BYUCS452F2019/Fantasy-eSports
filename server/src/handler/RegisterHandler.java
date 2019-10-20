package handler;

import business.RegisterBusiness;
import request.RegisterRequest;
import response.RegisterResponse;
import helper.*;

import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;

public class RegisterHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        RegisterResponse response;
        RegisterBusiness registerBusiness = new RegisterBusiness();

        try {
            if (exchange.getRequestMethod().toLowerCase().equals("post")) {
                Reader reader = new InputStreamReader(exchange.getRequestBody());
                RegisterRequest request = Decoder.decodeRegisterRequest(reader);

                    response = registerBusiness.register(request);

                    // Message will be null if no errors were thrown
                    if (response.getMessage() != null) {
                        exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_REQUEST, 0);
                    } else {
                        exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                    }

                    String responseString = Encoder.encode(response);
                    OutputStream body = exchange.getResponseBody();
                    writeString(responseString, body);
                    body.close();
            }
        } catch (IOException error) {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_INTERNAL_ERROR, 0);
            exchange.getResponseBody().close();
            error.printStackTrace();
        }
    }

    private void writeString(String str, OutputStream os) throws IOException {
        OutputStreamWriter sw = new OutputStreamWriter(os);
        sw.write(str);
        sw.flush();
    }
}
