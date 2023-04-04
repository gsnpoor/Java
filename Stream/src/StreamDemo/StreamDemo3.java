package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class StreamDemo3 {
    public static void main(String[] args) {
        //map转换数据流中数据的类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangwuji-15","zhouzhiruo-14","zhaomin-13");

        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));
        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));

        long count = list.stream().count();
        System.out.println(count);

        Object[] arr = list.stream().toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr1));*/

        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));
    }
}
