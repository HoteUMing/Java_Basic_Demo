public class Test_9_1_Thread {
    public void start() {
        Thread thread = Thread.currentThread();

        int priority = thread.getPriority();
        System.out.println("getPriority(): " + priority);
        //getPriority(): 5

        thread.setPriority(5);
        System.out.println("setPriority(5): " + thread.getPriority());
        //setPriority(5): 5

        thread.setName("main-0");
        System.out.println("setName(\"main-0\"): " + thread);
        //setName("main-0"): Thread[main-0,5,main]

        MyThread1 mt1 = new MyThread1();
        mt1.start();
        //getId(): 14
        //getName(): Thread-0

        MyThread1 mt2 = new MyThread1("testThread-0");
        mt2.start();
        //getId(): 15
        //getName(): testThread-0

        MyThread2 mt3 = new MyThread2();
        new Thread(mt3).start();
        //Thread.currentThread(): Thread[Thread-1,5,main]
        new Thread(mt3, "testThread-1").start();
        //Thread.currentThread(): Thread[testThread-1,5,main]
    }

    public static class MyThread1 extends Thread {
        public MyThread1() {
        }

        public MyThread1(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                long id = this.getId();
                System.out.println("getId(): " + id);
                sleep(1000);
                String name = this.getName();
                System.out.println("getName(): " + name);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static class MyThread2 implements Runnable {
        @Override
        public void run() {
            synchronized (this) {
                Run();
            }
        }

        public synchronized void Run() {
            Thread thread = Thread.currentThread();
            System.out.println("Thread.currentThread(): " + thread);
        }
    }
}
