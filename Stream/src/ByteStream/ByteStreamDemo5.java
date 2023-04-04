package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//大文件拷贝
public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("D:\\迅雷下载\\他是谁\\01.1080p.HD国语中字无水印[66影视www.66Ys.Co].mp4");
        byte[] bytes = new byte[1024 * 1024 * 5];
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\copy.mp4");

        //边读边写
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
