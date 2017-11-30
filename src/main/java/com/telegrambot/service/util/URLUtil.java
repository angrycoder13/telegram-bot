package com.telegrambot.service.util;

/**
 * Created by Just Code.
 */
public class URLUtil {

    public static String replaceWhiteSpaces(String url) {
        return url.replaceAll("\\s+", "%20");
    }

}
