package thread6;

//守护线程
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        /*当其他的非守护线程执行完毕之后，守护线程会陆续结束*/

        MyThread1 t1= new MyThread1();
        MyThread1 t2= new MyThread1();

        t1.setName("beitai");
        t2.setName("nvshen");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
