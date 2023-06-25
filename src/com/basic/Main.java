package com.basic;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1 . Add student");
        System.out.println("2 . Edit student by id");
        System.out.println("3 . Delete student by id");
        System.out.println("4 . Sort student by gpa");
        System.out.println("5 . Sort student by name");
        System.out.println("6 . Show student");
        System.out.println("0 . EXIT");
        System.out.println("---------------------------");
        System.out.print("Please choose : ");
    }

    public static void main(String[] args) {
        String choose = null;
        StudentManager studentManager = new StudentManager();
        Integer studentId;
        while (true) {
            showMenu();
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":
                    studentId = studentManager.inputId();
                    studentManager.edit(studentId);
                    break;
                case "3":
                    studentId = studentManager.inputId();
                    studentManager.delete(studentId);
                    break;
                case "4":
                    studentManager.sortStudentByGpa();
                    break;
                case "5":
                    studentManager.sortStudentByName();
                    break;
                case "6":
                    studentManager.show();
                    break;
                case "0":
                    {
                        System.out.println("exited!");
                        return;
                    }
                default:
                    System.out.println("Invalid ! please choose again !");
                    break;
            }
        }
    }
}
