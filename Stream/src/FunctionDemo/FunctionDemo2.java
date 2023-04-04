package FunctionDemo;


import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6, 2};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhang", "zhou", "zhao", "wang");

        /*list.stream()
                .filter(s->s.startsWith("z"))
                .filter(s->s.length() == 5)
                .forEach(s -> System.out.println(s));*/

        list.stream().filter(new FunctionDemo2():: method)
                .forEach(s -> System.out.println(s));

    }
    public boolean method(String s) {
        return s.startsWith("z") && s.length() == 5;
    }
}
