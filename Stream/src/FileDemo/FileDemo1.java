package FileDemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "C:\\Users\\poor\\Desktop\\aaa\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "C:\\Users\\poor\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        File parent2 = new File("C:\\Users\\poor\\Desktop\\aaa\\a.txt");
        File f4 = new File(parent2,child);
        System.out.println(f4);

    }
}
