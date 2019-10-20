package handler;

import business.LoginBusiness;
import request.LoginRequest;
import response.LoginResponse;
import helper.*;

import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;

public class LoginHandler implements HttpHandler {
    public void handle(HttpExchange exchange) throws IOException {
        LoginResponse response;
        LoginBusiness loginBusiness = new LoginBusiness();

        try {
            if (exchange.getRequestMethod().toLowerCase().equals("post")) {
                Reader reader = new InputStreamReader(exchange.getRequestBody());
                LoginRequest request = Decoder.decodeLoginRequest(reader);

                response = loginBusiness.login(request);

                //Message will be null if not errors were thrown
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
