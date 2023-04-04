package Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Callable6 implements Callable<Integer> {
    //10,5,20,50,100,200,500,800,2,80,300,700
    ArrayList<Integer> list;
    public Callable6(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws InterruptedException {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (Callable6.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }
        if (boxList.size() == 0){
            return null;
        }else {
            return Collections.max(boxList);
        }
    }
}
