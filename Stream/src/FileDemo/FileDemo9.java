package FileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//遍历所有文件
public class FileDemo9 {


    public static void main(String[] args) {
        File file = new File("D:\\");
        HashMap<String, Integer> map = getNumber(file);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "文件有" + entry.getValue() + "个");
        }


    }

    public static HashMap getNumber(File src) {
        HashMap<String, Integer> map = new HashMap<>();
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    String[] arr = name.split("\\.");
                    if (arr.length >= 2) {
                        String endName = arr[arr.length - 1];
                        if (map.containsKey(endName)) {
                            Integer count = map.get(endName);
                            map.put(endName, ++count);
                        } else {
                            map.put(endName, 1);
                        }
                    }
                } else {
                    HashMap<String, Integer> sonMap = getNumber(file);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        if (map.containsKey(entry.getKey())) {
                            Integer count = map.get(entry.getKey());
                            map.put(entry.getKey(), entry.getValue() + count);
                        } else {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
        return map;
    }
}
