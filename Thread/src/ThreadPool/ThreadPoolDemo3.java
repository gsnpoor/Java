package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo3 {
    public static void main(String[] args) throws InterruptedException {
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
