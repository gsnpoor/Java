package FileDemo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Poor\\Desktop\\aaa\\b.exe");
        /*System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());*/

        long len = f1.length() / 1024 / 1024;
        System.out.println(len + "MB");

        /*File f2 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        long len2 = f2.length();
        System.out.println(len2);
        //绝对路径
        File f3 = new File("program1\\text18\\num6\\Demo\\FileDemo2.java");
        System.out.println(f3.getAbsolutePath());
        //返回定义文件时使用的路径
        System.out.println(f3.getPath());
        //获取名字
        //文件名+后缀名 || 文件夹名
        System.out.println(f3.getName());

        long time = f1.lastModified();
        System.out.println(time);*/
    }
}