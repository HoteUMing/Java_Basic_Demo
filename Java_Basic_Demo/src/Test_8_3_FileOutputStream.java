import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test_8_3_FileOutputStream {
    public void start() {
        try {
            File file = new File("text.txt");
            file.createNewFile();

            FileOutputStream fos = new FileOutputStream(file, true);
            byte[] bytes = new byte[]{97, 98, 99, 100, 101, 102, 103};
            fos.write("title\r\n".getBytes());
            fos.write(bytes, 0, bytes.length);
            System.out.println("write(bytes, 0, bytes.length): " + Arrays.toString(bytes));
            //write(bytes, 0, bytes.length): [97, 98, 99, 100, 101, 102, 103]

            fos.flush();
            fos.close();
            file.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
