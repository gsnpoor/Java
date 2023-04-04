package num1.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArgsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "aasd","bas","add","de","easd","asdf","dadh","i");
        Collections.addAll(list2, " "," "," "," "," "," "," "," "," ");
        System.out.println(list);

        //打乱
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        /*int inn = Collections.binarySearch(list, "de");
        System.out.println(inn);*/
        System.out.println("--------------------------------");
        Collections.copy(list2, list);
        System.out.println(list2);

        /*Collections.fill(list,"aaa");
        System.out.println(list);

        Collections.swap(list,1,2);
        System.out.println(list);
        String max = Collections.min(list);
        System.out.println(max);*/
    }
}
