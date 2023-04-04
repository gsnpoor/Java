package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        /*Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split(",")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split(",")[1]);
                    }
                }));
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s-> Integer.parseInt(s.split(",")[1])
                )
                );
        System.out.println(map);
        list.stream()
                .filter(s -> s.startsWith("l") &&
                        Integer.parseInt(s.split(",")[1]) >= 24)
                .skip(1)
                .forEach(s -> System.out.println(s));*/
        Stream<String> l = list.stream().filter(s -> s.startsWith("l"));
        Stream<String> w = list.stream().filter(s -> s.startsWith("w"));
        Stream.concat(l,w).map(
                s -> new Actor(s.split(",")[0],
                        Integer.parseInt(s.split(",")[1])))
                .forEach(s -> System.out.println(s));
    }
}
