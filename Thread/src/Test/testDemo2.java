package Test;

public class testDemo2 {
    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);

        t1.setName("一：");
        t2.setName("二：");

        t1.start();
        t2.start();
    }
}
