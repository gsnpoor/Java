package Test;

import java.util.Random;

public class ThreadDemo3 extends Thread {
    static double money = 100;
    static int count = 3;
    static double MIN = 0.01;

    @Override
    public void run() {
        synchronized (ThreadDemo3.class) {
            if (count == 0) {
                System.out.println(Thread.currentThread().getName() + "没有抢到红包");
            } else {
                double num = 0;
                if (count == 1) {
                    num = money;
                } else {
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    num = r.nextDouble(MIN, bounds);
                    if (money < num) {
                        num = money;
                    }
                }
                System.out.println(Thread.currentThread().getName() + "抢到了" + num + "元");
                money = money - num;
                count--;
            }
        }
    }
}
