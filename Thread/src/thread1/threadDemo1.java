package thread1;

//多线程的第一种方式
public class threadDemo1 {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();

        t1.setName("111");
        t2.setName("222");

        t1.start();
        t2.start();
    }
}
