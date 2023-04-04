package BufferedStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

//将本地文件中的GBK文件转换为UTF-8
public class BufferedStreamDemo9 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text18\\aaa.txt",Charset.forName("GBK"));
        FileWriter fw = new FileWriter("text18\\bbb.txt",Charset.forName("UTF-8"));

        int b;
        while ((b = fr.read()) != -1) {
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
