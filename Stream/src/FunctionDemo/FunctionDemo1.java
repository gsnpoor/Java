package FunctionDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6, 2};
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4");
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));*/
        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
