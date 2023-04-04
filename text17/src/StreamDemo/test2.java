package StreamDemo;

import java.util.Arrays;
import java.util.Comparator;

public class test2 {
    public static void main(String[] args) {
        String[] arr = {"a", "aa", "aaaa", "aaa"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
