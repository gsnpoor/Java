package CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//字符流读取
//字符流的底层也是字节流，也是一个字节的读取，但是遇到中文就会一次读取多个
//GBK一次读取两个字节，UTF-8一次读三个字节

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text18\\aaa.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
