import java.util.Arrays;
import java.util.Random;

public class Test_4_Random {
    public void start() {
        Random r = new Random();

        boolean b = r.nextBoolean();
        System.out.println("nextBoolean(): " + b);
        //nextBoolean(): false

        byte[] bytes = new byte[5];
        r.nextBytes(bytes);
        System.out.println("nextBytes(bytes)" + Arrays.toString(bytes));
        //nextBytes(bytes)[4, -18, 20, 61, 73]

        double db = r.nextDouble();
        System.out.println("nextDouble(): " + db);
        //nextDouble(): 0.8192964378293072

        float f = r.nextFloat();
        System.out.println("nextFloat(): " + f);
        //nextFloat(): 0.27216375

        double g = r.nextGaussian();
        System.out.println("nextGaussian(): " + g);
        //nextGaussian(): 2.0332856781737765

        int i = r.nextInt();
        System.out.println("nextInt(): " + i);
        //nextInt(): -296402314

        int num = r.nextInt(10);
        System.out.println("nextInt(10): " + num);
        //nextInt(10): 8

        long l = r.nextLong();
        System.out.println("nextLong(): " + l);
        //nextLong(): -5008595948936808178
    }
}
