package PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

//字节打印流
public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("Stream\\aaa.txt"),true, Charset.forName("UTF-8"));
        ps.println(97);
        ps.print(true);
        ps.println("");
        ps.printf("%s爱上了%s","阿珍","阿强");
        ps.close();
    }
}
