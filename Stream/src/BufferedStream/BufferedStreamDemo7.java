package BufferedStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//利用转换流按照指定字符编码读取
public class BufferedStreamDemo7 {
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
