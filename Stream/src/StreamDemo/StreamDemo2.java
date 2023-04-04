package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "aaa","aaa","bbb");
        Collections.addAll(list2, "ccc","aaa","bbb");

        //list.stream().distinct().forEach(s -> System.out.println(s));

        Stream.concat(list.stream(), list2.stream()).distinct().forEach(s -> System.out.println(s));
    }
}
