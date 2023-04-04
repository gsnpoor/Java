package thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//多线程的第三种方式
public class threadDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*可以获取到多线程运行的结果*/

        //表示多线程要执行的任务
        MyCallable mc = new MyCallable();
        //作用管理多线程运行的结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        t1.start();
        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
