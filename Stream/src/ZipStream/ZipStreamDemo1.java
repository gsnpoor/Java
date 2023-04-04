package ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//解压缩流
public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("Stream\\aaaa.zip");
        File dest = new File("Stream", src.getName().split("\\.")[0]);
        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry);

            if (entry.isDirectory()) {
                File f = new File(dest, entry.toString());
                f.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
