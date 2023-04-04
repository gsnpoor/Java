package CharStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//加密文件

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("text18\\ba.jpg");
        FileOutputStream fos = new FileOutputStream("text18\\bb.jpg");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b^2);
        }
        fos.close();
        fis.close();
    }

}
