package com.regex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nhap so dien thoai : ");
            String phone = bufferedReader.readLine();
            System.out.println(Regex.regexPhone(phone));
            System.out.println("Nhap email : ");
            String email = bufferedReader.readLine();
            System.out.println(Regex.regexEmail(email));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println();
    }
}
