package thread9;

//同步方法
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("第一");
        t2.setName("第二");
        t3.setName("第三");

        t1.start();
        t2.start();
        t3.start();
    }

}
