import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Test_8_5_FileWriter {
    public void start() {
        try {
            File file = new File("text.txt");
            file.createNewFile();

            FileWriter fw = new FileWriter("text.txt", true);
            char[] chars = new char[]{'t', 'e', 's', 't'};
            fw.write("title\r\n");
            fw.write(chars, 0, chars.length);
            System.out.println("write(chars, 0, chars.length): " + Arrays.toString(chars));
            //write(chars, 0, chars.length): [t, e, s, t]

            fw.flush();
            fw.close();
            file.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
