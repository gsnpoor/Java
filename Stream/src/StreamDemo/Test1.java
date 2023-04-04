package StreamDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = List.of("zhangsan", "lisi", "wangwu");
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu");
        Map<String, String> map = Map.of("1", "yi", "2", "er", "3", "san");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println("---------------------------");

        /*Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }*/
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }
        System.out.println("---------------------------");


//        set.add("aaa");
//        set.remove("lisi");
    }
}
