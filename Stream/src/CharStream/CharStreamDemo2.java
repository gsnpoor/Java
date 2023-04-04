package CharStream;

import java.io.FileReader;
import java.io.IOException;

//字符流读取

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text18\\aaa.txt");
        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
