package WaitAndNotify1;

public class Desk {
    /*作用：控制生产者和消费者的执行*/
    public static int foodFlags = 0;
    public static int count = 10;
    public static Object lock = new Object();
}
