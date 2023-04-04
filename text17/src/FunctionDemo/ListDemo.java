package FunctionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*list.add(1,"qqq");
        System.out.println(list);*/

        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        /*for (String s : list) {
            System.out.println(s);
        }
        
        list.forEach(s -> System.out.println(s));

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }*/
        //列表迭代器
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            if ("bbb".equals(str))
                it.add("qqq");
            System.out.println(str);
        }
        System.out.println(list);
    }
}
