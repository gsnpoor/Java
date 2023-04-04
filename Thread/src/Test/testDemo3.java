package Test;

public class testDemo3 {
    public static void main(String[] args) {
        ThreadDemo3 t1 = new ThreadDemo3();
        ThreadDemo3 t2 = new ThreadDemo3();
        ThreadDemo3 t3 = new ThreadDemo3();
        ThreadDemo3 t4 = new ThreadDemo3();
        ThreadDemo3 t5 = new ThreadDemo3();

        t1.setName("一");
        t2.setName("二");
        t3.setName("三");
        t4.setName("四");
        t5.setName("五");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
