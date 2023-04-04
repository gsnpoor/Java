package thread9;

public class MyRunnable implements Runnable {
    int ticket = 0;

    //锁对象一定要是唯一的
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket +"票");
        }
        return false;
    }
}
