package thread5;

//线程优先级
public class ThreadDemo1 {
    public static void main(String[] args){
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"飞机");
        Thread t2 = new Thread(mr,"大炮");

        //线程优先级默认为5
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
