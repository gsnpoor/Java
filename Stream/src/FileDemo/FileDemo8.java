package FileDemo;

import java.io.File;

//删除多级文件夹
public class FileDemo8 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Poor\\Desktop\\aaa");
        findAVI(file);
    }


    public static void findAVI(File src){
        File[] files = src.listFiles();
        if (files != null) {
            for (File file: files){
                if (file.isFile()){
                    file.delete();
                }else {
                    findAVI(file);
                }
            }
        }
        src.delete();
    }
}
