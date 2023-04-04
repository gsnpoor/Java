package ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

//压缩单个文件
public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File src = new File("Stream\\ddd.txt");
        File dest = new File(src.getParentFile(), src.getName().split("\\.")[0] + ".zip");
        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //压缩包内的路径
        ZipEntry entry = new ZipEntry("z.txt");
        zos.putNextEntry(entry);
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
