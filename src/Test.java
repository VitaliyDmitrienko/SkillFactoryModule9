// Module 9. Exercise 9.3.1.

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File folder = new File("D:\\Download"); //Ваша папка
        long size = getFolderSize(folder);
        System.out.println((size) + " bytes");
        System.out.println((size / 1024 / 1024) + " MB");
    }

    private static long getFolderSize(File folder) {
        File[]files = folder.listFiles();
        long length = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}