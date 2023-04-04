package thread2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //返回当前线程的对象
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "helloWorld");
        }
    }
}
