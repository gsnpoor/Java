package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);

        //hm.keySet().stream().forEach(s -> System.out.println(s));
        //hm.entrySet().stream().forEach(s -> System.out.println(s));

        int[] arr1 = {1, 2, 3, 4};
        String[] arr2 = {"a", "b", "c"};

        //Arrays.stream(arr1).forEach(s -> System.out.println(s));
        //Arrays.stream(arr2).forEach(s -> System.out.println(s));
        Stream.of(arr2).forEach(s -> System.out.println(s));
    }
}
