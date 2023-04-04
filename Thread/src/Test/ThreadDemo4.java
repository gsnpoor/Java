package Test;


import java.util.ArrayList;
import java.util.Collections;

public class ThreadDemo4 extends Thread{
    //10,5,20,50,100,200,500,800,2,80,300,700
    ArrayList<Integer> list;

    public ThreadDemo4(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ThreadDemo4.class){
                if (list.size() == 0) {
                    break;
                }else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "抽到了" + prize + "元奖品");
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
