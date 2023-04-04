package thread7;

//插入线程
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1= new MyThread1();
        t1.setName("飞机");
        t1.start();

        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
        }
    }
}
