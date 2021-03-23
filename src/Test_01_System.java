public class Test_01_System {
    public void start() {
        long time = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis：" + time);
        //System.currentTimeMillis : 1611669529003

        System.gc();
        System.exit(0);
    }
}
