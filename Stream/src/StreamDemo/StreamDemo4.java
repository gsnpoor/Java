package StreamDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangwuji-nan-1", "zhangwuji-nan-1", "zhouzhiruo-nan-2", "zhaomin-nv-3");

        //不去重
        List<String> list1 = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(list1);
        //去重
        Set<String> set = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(set);

        //键不能重复
        /*Map<String, Integer> map = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .distinct()
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/

        Map<String, Integer> map = list.stream()
                .filter(s -> "nan".equals(s.split("-")[1]))
                .distinct()
                .collect(Collectors.toMap(s-> s.split("-")[0],s-> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    }
}
