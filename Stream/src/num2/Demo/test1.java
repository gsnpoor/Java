package num2.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list,"yi","er","san","si","wu","liu","qi","ba","jiu");
        int len = list.size();

        /*ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list1);*/
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < len; j++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            System.out.println(list2);
            list.addAll(list2);
            list2.clear();
        }

    }
}
