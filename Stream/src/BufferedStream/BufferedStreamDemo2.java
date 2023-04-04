package BufferedStream;

import java.io.*;

//字节缓冲流
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text18\\aaa.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text18\\bbb.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
