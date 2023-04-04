package ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

//压缩文件夹
public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("Stream\\aaa");
        File dest = new File(src.getParentFile(), src.getName() + ".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        toZip(src, zos, src.getName());
        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);

                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();

                zos.closeEntry();
            } else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }

    }
}
