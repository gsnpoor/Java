package thread4;

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread("飞机");
        MyThread t2= new MyThread("坦克");

        t1.start();
        t2.start();

        //System.out.println(Thread.currentThread().getName());    //->main

        /*System.out.println("11111111");
        Thread.sleep(5000);
        System.out.println("22222222");*/
    }
}
