import java.io.File;
import java.io.FileFilter;

public class Test_08_2_FileFilter {
    public void start() {
        try {
            File file1 = new File("demo");
            File file2 = new File(file1, "text.txt");
            File file3 = new File("demo\\", "demo.txt");
            file1.mkdir();
            file2.createNewFile();
            file3.createNewFile();

            File[] listFiles = file1.listFiles(new FileFilterImpl());
            for (File f : listFiles) {
                System.out.println("file1.listFiles(): " + f);
                //file1.listFiles(): demo\text.txt
            }

            file3.delete();
            file2.delete();
            file1.delete();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static class FileFilterImpl implements FileFilter {
        @Override
        public boolean accept(File pathname) {
            if (pathname.getName().toLowerCase().startsWith("demo")) {
                System.out.println(pathname.getName() + " startsWith(\"demo\"),return false");
                //demo.txt startsWith("demo"),return false
                return false;
            } else {
                return true;
            }
        }
    }
}
