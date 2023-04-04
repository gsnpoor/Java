package FileDemo;

import java.io.File;

//遍历文件
public class FileDemo7 {
    public static void main(String[] args) {
        findAVI();
    }

    public static void findAVI(){
        File[] arr = File.listRoots();
        for (File file: arr) {
            findAVI(file);
        }
    }
    public static void findAVI(File src){
        File[] files = src.listFiles();
        if (files != null) {
            for (File file: files){
                if (file.isFile()){
                    String name = file.getName();
                    if (name.endsWith(".avi") && file.length() / 1024 /1024 > 0) {
                        System.out.println(file);
                    }
                }else {
                    findAVI(file);
                }
            }
        }
    }
}
