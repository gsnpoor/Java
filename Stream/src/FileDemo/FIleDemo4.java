package FileDemo;

import java.io.File;
import java.io.IOException;

public class FIleDemo4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\Poor\\Desktop\\aaa");

        //获取aaa文件夹中的所有内容
        File[] files = f1.listFiles();
        for (File f: files) {
            System.out.println(f);
        }
    }
}
