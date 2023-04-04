package Test;

import java.util.ArrayList;
import java.util.Collections;

public class testDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        ThreadDemo4 t1 = new ThreadDemo4(list);
        ThreadDemo4 t2 = new ThreadDemo4(list);

        t1.setName("抽奖箱一");
        t2.setName("抽奖箱二");

        t1.start();
        t2.start();

    }
}
