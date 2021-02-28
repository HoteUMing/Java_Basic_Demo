import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test_8_4_FileInputStream {
    public void start() {
        try {
            File file = new File("text.txt");
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream("text.txt", true);
            byte[] bytes1 = new byte[]{97, 98, 99, 100, 101, 102, 103};
            fos.write("title\r\n".getBytes());
            fos.write(bytes1, 0, bytes1.length);
            fos.flush();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            int chr = 0;
            while ((chr = fis.read()) != -1) {
                System.out.print((char) chr);
                //title
                //abcdefg
            }
            System.out.print("\n");

            FileInputStream fis2 = new FileInputStream(file);
            byte[] bytes2 = new byte[1024];
            int len = 0;
            while ((len = fis2.read(bytes2)) != -1) {
                System.out.println("read byte[] length : " + len);
                //read byte[] length : 14
                System.out.print(new String(bytes2, 0, len));
                //title
                //abcdefg
            }

            fis.close();
            fis2.close();
            file.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
