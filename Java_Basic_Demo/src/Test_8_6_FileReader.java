import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test_8_6_FileReader {
    public void start() {
        try {
            File file = new File("text.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            char[] chars1 = new char[]{'t', 'e', 's', 't'};
            fw.write("title\r\n");
            fw.write(chars1, 0, chars1.length);
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            int ascll = 0;
            while ((ascll = fr.read()) != -1) {
                System.out.print((char) ascll);
                //title
                //test
            }
            System.out.print("\n");

            FileReader fr2 = new FileReader(file);
            char[] chars2 = new char[1024];
            int length = 0;
            while ((length = fr2.read(chars2)) != -1) {
                System.out.println("read char[] length : " + length);
                //read char[] length : 11
                System.out.println(new String(chars2, 0, length));
                //title
                //test
            }

            fr.close();
            fr2.close();
            file.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
