package StreamDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("zhangsan", "nanjing");
        hm.put("lisi", "beijing");
        hm.put("wangwu", "shanghai");
        hm.put("zhaoliu", "shenzhen");
        hm.put("sunqi", "hangzhou");
        hm.put("aaa", "111");

        /*Set<Map.Entry<String, String>> entries = hm.entrySet();
        Map.Entry[] arr = entries.toArray(new Map.Entry[entries.size()]);
        Map map = Map.ofEntries(arr);

        Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "," + value);
        }*/
        Map.copyOf(hm);
    }
}
