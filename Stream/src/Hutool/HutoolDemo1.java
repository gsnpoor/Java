package Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HutoolDemo1 {
    public static void main(String[] args) {
        File file = FileUtil.file("D:\\development\\program\\program1\\Stream", "aaa", "bbb", "a.txt");
        System.out.println(file);
        /*File touch = FileUtil.touch(file);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        FileUtil.writeLines(list,file,"UTF-8",true);*/
        List<String> strings = FileUtil.readLines(file, "UTF-8");
        System.out.println(strings);
    }
}
