package com.app.socilon.utils;

import android.util.Patterns;

public class CommomUtils {
    public static boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        boolean flag = false;

        if (email.matches(emailPattern)) {
            flag = true;
        }
        return flag;

    }



    private boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
