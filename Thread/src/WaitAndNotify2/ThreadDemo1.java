package WaitAndNotify2;

import java.util.concurrent.ArrayBlockingQueue;

//阻塞队列
public class ThreadDemo1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        c.start();
        f.start();
    }
}
