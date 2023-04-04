package Test;

public class ThreadDemo2 extends Thread{
    static int n = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (ThreadDemo2.class){
                if (n > 100){
                    break;
                }
                if (n % 2 == 1){
                    System.out.println(getName() + n);
                }
            }
            n += 2;
        }
    }
}
