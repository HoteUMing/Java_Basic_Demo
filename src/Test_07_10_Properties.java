import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class Test_07_10_Properties {
    public void start() {
        try {
            Properties properties1 = new Properties();
            Properties properties2 = new Properties(10);
            properties1.setProperty("0", "a");
            properties1.setProperty("1", "b");
            properties1.setProperty("2", "c");
            System.out.println("properties1: " + properties1.toString());
            //properties1: {0=a, 1=b, 2=c}

            File file = new File("prop.txt");
            FileWriter writer = new FileWriter(file);
            properties1.store(writer, "sava data");
            writer.close();

            FileReader reader = new FileReader("prop.txt");
            properties2.load(reader);
            Set<String> set = properties2.stringPropertyNames();
            for (String key : set) {
                String value = properties2.getProperty(key);
                System.out.println("properties2.getProperty(" + key + "): " + value);
                //properties2.getProperty(0): a
                //properties2.getProperty(1): b
                //properties2.getProperty(2): c
            }
            reader.close();
            file.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
