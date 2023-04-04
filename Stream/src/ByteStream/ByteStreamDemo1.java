package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text18\\aaa.txt");
        //fos.write(97);

        byte[] by = {97,98,99,100,101};
        fos.write(by);

        fos.write(by,0,3);
        fos.close();
    }
}
