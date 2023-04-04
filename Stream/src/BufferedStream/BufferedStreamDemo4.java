package BufferedStream;

import java.io.*;

//四种文件拷贝方式
public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        method1();//
        //method2();//0.327秒
        //method3();//4.806秒
        //method4();//0.385秒
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");

    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("text18\\15.mp4");
        FileOutputStream fos = new FileOutputStream("text18\\16.mp4");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("text18\\15.mp4");
        FileOutputStream fos = new FileOutputStream("text18\\16.mp4");
        byte[] b = new byte[8192];
        int len;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text18\\15.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text18\\16.mp4"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text18\\15.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text18\\16.mp4"));
        byte[] b = new byte[8192];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
    }
}
