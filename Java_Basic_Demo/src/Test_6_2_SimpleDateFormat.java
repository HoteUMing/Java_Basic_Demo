import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_6_2_SimpleDateFormat {
    public void start() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH-mm-ss:SS");
        String str = sdf.format(new Date(1579583281187L));
        System.out.println("format(new Date(1579583281187L)): " + str);
        //format(new Date(1579583281187L)): 2020-01-21 下午 13-08-01:187

        try {
            Date date = sdf.parse(str);
            System.out.println("parse(str): " + date);
            //parse(str): Tue Jan 21 13:08:01 CST 2020
        } catch (ParseException e) {
            System.out.println("error : " + e);
        }
    }
}
