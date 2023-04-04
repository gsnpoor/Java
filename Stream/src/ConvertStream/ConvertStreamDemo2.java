package ConvertStream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

//利用转换流按照指定字符编码写出
public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text18\\aaa.txt"),"GBK");
        osw.write("你你你你");
        osw.close();*/

        FileWriter fw = new FileWriter("text18\\aaa.txt",Charset.forName("GBK"));
        fw.write("你你你");
        fw.close();
    }

}
