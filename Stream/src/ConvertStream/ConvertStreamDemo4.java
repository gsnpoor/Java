package ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

//利用字节流读取文件
public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("text18\\aaa.txt"), Charset.forName("GBK")));
        String line ;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
