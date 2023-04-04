package CharStream;

import java.io.*;

//拷贝文件夹

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\development\\program\\program1\\ssss");
        File dest = new File("D:\\development\\program\\program1\\bbbb");

        copydir(src,dest);

    }

    private static void copydir(File src, File dest) throws IOException {
        //如果文件夹不存在，创建文件夹
        dest.mkdirs();

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }else {
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
