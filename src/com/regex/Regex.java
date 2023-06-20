package com.regex;

public class Regex {
    public static String regexPhone(String phone) {
        String regexPhone = "^0[0-9]{9,10}";
        if (phone.matches(regexPhone)) {
            return "Dung dinh dang so dien thoai";
        }
        return "Sai dinh dang so dien thoai roi";
    }

    public static String regexEmail(String email) {
        String regexEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (email.matches(regexEmail)) {
            return "Dung dinh dang email";
        }
        return "Sai dinh dang email roi";
    }
}
