import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_09_2_ExecutorService {
    public void start() {
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(new MyThread());
        //Thread.currentThread(): Thread[pool-1-thread-2,5,main]
        es.submit(new MyThread());
        //Thread.currentThread(): Thread[pool-1-thread-1,5,main]
        es.submit(new MyThread());
        //Thread.currentThread(): Thread[pool-1-thread-1,5,main]

        es.shutdown();

        boolean b1 = es.isShutdown();
        System.out.println("isShutdown(): " + b1);
        //isShutdown(): true

        boolean b2 = es.isTerminated();
        System.out.println("isTerminated(): " + b2);
        //isTerminated(): true
    }

    public static class MyThread implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("Thread.currentThread(): " + thread);
        }
    }
}
