package br.com.gamesporgamers.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {

    public static boolean checkPassword(String inputPassword, String hashedPassword) {
        return BCrypt.checkpw(inputPassword, hashedPassword);
    }

}