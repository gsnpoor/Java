package num1;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //boolean result = list.remove("eee");
        String str = list.remove(2);
        System.out.println(str);
        list.set(1, "ddd");
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.size());
    }
}
