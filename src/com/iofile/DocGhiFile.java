package com.iofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFile {
    public static File isFile(String path) throws IOException{
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void ghiFile(File file, byte[] data) throws IOException{
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.close();
    }

    public static String docFile(File file) throws IOException{
        StringBuilder sb = new StringBuilder();
        FileInputStream fis = new FileInputStream(file);
        int c;
        while ((c = fis.read()) != -1) {
            char a = (char) c;
            sb.append(a);
        }
        fis.close();
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            String name = "Tran Van Hao";
            byte[] data = name.getBytes();
            ghiFile(isFile("doc.txt"), data);
            String docF = docFile(isFile("doc.txt"));
            System.out.println(docF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
