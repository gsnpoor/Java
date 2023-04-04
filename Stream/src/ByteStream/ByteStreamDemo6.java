package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//unicode transfer format(UTF)
//字节流读取中文会乱码：GBK所规定的汉字占两个字节，但是UTF-8的标准是汉字三字节(1110**** 10****** 10******)
//所以使用字节流读取时只会读取前两个字节导致乱码

//如何不产生乱码：1.不要使用字节流读取文本文件; 2.编码解码是使用同一个码表，同一个编码方式
public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        String str = "ai你呦";
        //编码
        byte[] bytes1 = str.getBytes();//默认UTF-8
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //解码
        String str2 = new String(bytes1);
        System.out.println(str2);

        String str3 = new String(bytes2,"GBK");
        System.out.println(str3);

    }
}
