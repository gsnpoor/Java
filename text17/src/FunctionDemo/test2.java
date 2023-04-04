package FunctionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class test2 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();
        /*while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
            if ("bbb".equals(str)){
                it.remove();
            }
        }*/
        for (String str: coll)
            System.out.println(str);

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach(s -> System.out.println(s));
        //System.out.println(coll);
    }
}
