package helper;

import java.io.*;
import request.*;
import com.google.gson.*;

/**
 * Class to turn json into java objects
 */
public class Decoder {
    public Decoder() {}

    public static RegisterRequest decodeRegisterRequest(Reader json) {
        return new Gson().fromJson(json, RegisterRequest.class);
    }
}
