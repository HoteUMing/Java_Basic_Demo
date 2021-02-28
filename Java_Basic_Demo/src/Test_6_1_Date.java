import java.util.Date;

public class Test_6_1_Date {
    public void start() {
        Date date1 = new Date();
        System.out.println("date1: " + date1);
        //date1: Wed Feb 17 22:58:36 CST 2021

        Date date2 = new Date(1579583281187L);
        System.out.println("date2: " + date2);
        //date2: Tue Jan 21 13:08:01 CST 2020

        boolean b1 = date1.after(date2);
        System.out.println("after(date2): " + b1);
        //after(date2): true

        boolean b2 = date1.before(date2);
        System.out.println("before(date2): " + b2);
        //before(date2): false

        boolean b3 = date1.equals(date2);
        System.out.println("equals(date2): " + b3);
        //equals(date2): false

        int compare = date1.compareTo(date2);
        System.out.println("compareTo(date2): " + compare);
        //compareTo(date2): 1

        date1.setTime(1579583281187L);
        System.out.println("setTime(1579583281187L): " + date1);
        //setTime(1579583281187L): Tue Jan 21 13:08:01 CST 2020

        long l = date1.getTime();
        System.out.println("getTime(): " + l);
        //getTime(): 1579583281187
    }
}
