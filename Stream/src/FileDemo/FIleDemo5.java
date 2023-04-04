package FileDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FIleDemo5 {
    public static void main(String[] args) throws IOException {
        /*File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        File f1 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        String[] arr2 = f1.list();
        for (String s: arr2){
            System.out.println(s);
        }

        File f2 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src= new File(dir, name);
                return src.isFile() && name.endsWith("txt");
            }
        });
        System.out.println(Arrays.toString(arr3));*/

        File f3 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        File[] arr = f3.listFiles();
        for (File f: arr) {
            if (f.isFile() && f.getName().endsWith("txt")){
                System.out.println(f);
            }
        }

        /*File f4 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        File[] arr1 = f4.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith("txt");
            }
        });
        System.out.println(Arrays.toString(arr1));

        File f4 = new File("C:\\Users\\Poor\\Desktop\\aaa");
        File[] arr1 = f4.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir,name);
                return src.isFile() && name.endsWith("txt");
            }
        });
        System.out.println(Arrays.toString(arr1));*/
    }
}
