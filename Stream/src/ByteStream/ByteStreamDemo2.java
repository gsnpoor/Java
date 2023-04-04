package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text18\\aaa.txt", true);
        String str = "helloworld";
        byte[] arr = str.getBytes();
        fos.write(arr);

        /*换行: Windows--\r\n
        Linux--\n
        Mac--\r*/
        String str1 = "\r\n";
        byte[] arr1 = str1.getBytes();
        fos.write(arr1);

        String str2 = "helloworld";
        byte[] arr2 = str2.getBytes();
        fos.write(arr2);
        fos.close();
    }
}
