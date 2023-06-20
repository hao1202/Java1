package com.object;

public class SinhVien {
    // Các thuộc tính của đối tượng
    private String id;
    private String name;
    private int birthOfYear;
    
    // Constructor không tham số
    public SinhVien() {}

    // Constructor có tham số
    public SinhVien(String id , String name , int birthOfYear) {
        this.id = id;
        this.name = name;
        this.birthOfYear = birthOfYear;
    }

    // Getter and setter : Đảm bảo tính đóng gói encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + birthOfYear;
    }
}
