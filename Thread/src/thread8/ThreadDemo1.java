package thread8;

//同步代码块
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("第一");
        t2.setName("第二");
        t3.setName("第三");

        t1.start();
        t2.start();
        t3.start();
    }

}
