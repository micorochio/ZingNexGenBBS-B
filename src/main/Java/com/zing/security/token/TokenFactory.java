package com.zing.security.token;

import java.util.UUID;

/**
 * Created by zing on 2017/3/18.
 */
public class TokenFactory {
    public static final String TAG = "token";

    public static String getToken() {
        synchronized (TokenFactory.class) {
            return String.valueOf(UUID.randomUUID());
        }
    }
}
