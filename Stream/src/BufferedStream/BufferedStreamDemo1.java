package BufferedStream;

import java.io.*;

//字节缓冲流
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text18\\aaa.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text18\\bbb.txt"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
