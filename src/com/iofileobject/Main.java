package com.iofileobject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ConNguoi> list = new ArrayList<>();

        // fake data
        // list.add(new ConNguoi("123", "Tran Van Hao", 19));
        // list.add(new ConNguoi("123", "Tran Van Hao", 19));
        // list.add(new ConNguoi("123", "Tran Van Hao", 19));

        try {
            // ghi file
            // Xfile.ghiFile(Xfile.isFile("doc.obj"), list);
            // docFile
            list = Xfile.docFile(Xfile.isFile("doc.obj"));
            for (ConNguoi conNguoi : list) {
                System.out.println(conNguoi.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
