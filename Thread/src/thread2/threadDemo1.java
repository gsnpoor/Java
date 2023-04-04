package thread2;

//多线程的第二种方式
public class threadDemo1 {
    public static void main(String[] args) {
        MyRun mr= new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("111");
        t2.setName("222");
        
        t1.start();
        t2.start();
    }
}
