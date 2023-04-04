package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");

        list.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));
    }
}
