import java.util.Scanner;

public class Test_2_Scanner {
    public void start() {
        Scanner sc = new Scanner(System.in);
        sc.reset();

        //输入：hasNext & nextLine
        boolean b = sc.hasNext();
        System.out.println("sc.hasNext()：" + b);
        //sc.hasNext()：true

        String line = sc.nextLine();
        System.out.println("nextLine(): " + line);
        //nextLine(): hasNext & nextLine

        //输入：next
        String str = sc.next();
        System.out.println("next(): " + str);
        //next(): next

        //输入：true
        boolean bl = sc.nextBoolean();
        System.out.println("nextBoolean(): " + bl);
        //nextBoolean(): true

        //输入：1
        byte bt = sc.nextByte();
        System.out.println("nextByte(): " + bt);
        //nextByte(): 1

        //输入：2.00
        double db = sc.nextDouble();
        System.out.println("nextDouble(): " + db);
        //nextDouble(): 2.0

        //输入：3.0
        float f = sc.nextFloat();
        System.out.println("nextFloat(): " + f);
        //nextFloat(): 3.0

        //输入：4
        int num = sc.nextInt();
        System.out.println("nextInt(): " + num);
        //nextInt(): 4

        //输入：5
        long l = sc.nextLong();
        System.out.println("nextLong(): " + l);
        //nextLong(): 5

        //输入：6
        short s = sc.nextShort();
        System.out.println("nextShort(): " + s);
        //nextShort(): 6

        sc.close();
    }
}
