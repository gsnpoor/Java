package ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//字节输入流循环读取
public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text18\\aaa.txt");
        /*int read = fis.read();
        System.out.println(read);*/

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char)b);
        }
        fis.close();
    }
}
