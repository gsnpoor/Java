package FileDemo;

import java.io.File;
import java.io.IOException;

public class FIleDemo3 {
    public static void main(String[] args) throws IOException {
        /*File f1 = new File("C:\\Users\\Poor\\Desktop\\aaa\\c.txt");
        //创建新文件
        boolean b = f1.createNewFile();
        System.out.println(b);

        //创建单级文件夹
        File f2 = new File("C:\\Users\\Poor\\Desktop\\aaa\\ddd");
        boolean b1 = f2.mkdir();
        System.out.println(b1);

        //创建多级或单级文件夹
        File f3 = new File("C:\\Users\\Poor\\Desktop\\aaa\\eee\\fff");
        boolean b2 = f3.mkdirs();
        System.out.println(b2);*/

        File f4 = new File("C:\\Users\\Poor\\Desktop\\aaa\\c.txt");
        boolean b3 = f4.delete();
        System.out.println(b3);
    }
}
