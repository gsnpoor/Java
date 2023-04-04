package Test;


public class ThreadDemo1 extends Thread{

    static int count = 1000;
    @Override
    public void run() {
        while (true){
            synchronized (ThreadDemo2.class) {
                if (count != 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(getName() + "卖票，并且剩余票数为" + count);
                }else {
                    break;
                }
            }
        }

    }
}
