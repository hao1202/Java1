package com.iofileobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Xfile {
    public static File isFile(String path) throws IOException{
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void ghiFile(File file , List<ConNguoi> list) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (ConNguoi conNguoi : list) {
            oos.writeObject(conNguoi);
        }
        oos.close();
        fos.close();
    }

    public static List<ConNguoi> docFile(File file) throws IOException, ClassNotFoundException {
        List<ConNguoi> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (fis.available() > 0) {
            ConNguoi conNguoi = (ConNguoi) ois.readObject();
            list.add(conNguoi);
        }
        return list;
    }
}
