package FunctionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class test1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        /*coll.clear();
        System.out.println(coll);*/

        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        boolean result = coll.contains("aaa");
        System.out.println(result);
    }
}
