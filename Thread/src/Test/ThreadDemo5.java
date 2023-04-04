package Test;


import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo5 extends Thread {
    //10,5,20,50,100,200,500,800,2,80,300,700
    ArrayList<Integer> list;

    public ThreadDemo5(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (ThreadDemo5.class) {
                if (list.size() == 0) {
                    System.out.println(getName() + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
