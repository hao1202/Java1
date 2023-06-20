package com.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap so dien thoai : ");
            String phone = bufferedReader.readLine();
            System.out.println(Regex.regexPhone(phone));
            System.out.println("Nhap email : ");
            String email = bufferedReader.readLine();
            System.out.println(Regex.regexEmail(email));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
