package PrintStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

//字节打印流
public class PrintStreamDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("Stream\\aaa.txt"), true);
        pw.println("nihao");
        pw.print(true);
        pw.println("");
        pw.printf("%s爱上了%s", "阿珍", "阿强");
        pw.close();
    }
}
