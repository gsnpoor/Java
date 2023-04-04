package ConvertStream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

//利用转换流按照指定字符编码读取
public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("text18\\aaa.txt"),"GBK");
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();*/

        FileReader fr = new FileReader("text18\\aaa.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }

}
