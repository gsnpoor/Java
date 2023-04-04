package Test;

public class testDemo1 {
    public static void main(String[] args) {
        ThreadDemo1 td = new ThreadDemo1();
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
