package com.basic;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> listStudent;
    private StudentDao studentDao;

    public StudentManager() {
        studentDao = new StudentDao();
        listStudent = studentDao.read();
    }

    public void add() {
        Integer id = (listStudent.size() > 0) ? (listStudent.size() + 1) : 1;
        String name = inputName();
        Integer age = inputAge();
        String address = inputAddress();
        Float gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        listStudent.add(student);
        studentDao.write(listStudent);
    }

    public void edit(Integer id) {
        boolean isExisted = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {
                isExisted = true;
                listStudent.get(i).setName(inputName());
                listStudent.get(i).setAge(inputAge());
                listStudent.get(i).setAddress(inputAddress());
                listStudent.get(i).setGpa(inputGpa());
                System.out.println("Edit successful !");
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Id = %d not existed. \n", id);
        } else {
            studentDao.write(listStudent);
        }
    }

    public void delete(Integer id) {
        Student student = null;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId().equals(id)) {
                student = listStudent.get(i);
                break;
            }
        }
        if (student != null) {
            listStudent.remove(student);
            System.out.println("Delete successful !");
            studentDao.write(listStudent);
        } else {
            System.out.printf("Id = %d not existed. \n", id);
        }
    }

    public Integer inputId() {
        System.out.print("Input student id : ");
        while (true) {
            try {
                Integer id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (Exception e) {
                System.out.println("Invalid ! Input student id again");
            }
        }
    }

    public void sortStudentByName() {
        Collections.sort(listStudent, new SortStudentByName());
    }

    public void sortStudentByGpa() {
        Collections.sort(listStudent, new SortStudentByGpa());
    }

    public void show() {
        for (Student student : listStudent) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%-25s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f | \n", student.getGpa());
        }
    }

    public String inputName() {
        System.out.print("Input student name : ");
        return scanner.nextLine();
    }

    private String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    private Integer inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                Integer age = Integer.parseInt((scanner.nextLine()));
                if (age < 0 || age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    private float inputGpa() {
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                float gpa = Float.parseFloat((scanner.nextLine()));
                if (gpa < 0.0 || gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
