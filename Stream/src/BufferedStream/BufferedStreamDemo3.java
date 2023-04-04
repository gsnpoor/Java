package BufferedStream;

import java.io.*;

//字符缓冲流
public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new FileReader("text18\\aaa.txt"));

        String line = br.readLine();
        System.out.println(line);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        */

        BufferedWriter bw = new BufferedWriter(new FileWriter("text18\\bbb.txt",true));
        bw.write("12");
        //跨平台的换行代码
        bw.newLine();
        bw.write("23");
        bw.newLine();
        bw.close();

    }
}
