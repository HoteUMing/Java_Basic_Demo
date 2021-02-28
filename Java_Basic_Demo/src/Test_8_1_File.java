import java.io.File;
import java.util.Arrays;

public class Test_8_1_File {
    public void start() {
        String ps = File.pathSeparator;
        System.out.println("File.pathSeparator: " + ps);
        //File.pathSeparator: ;

        String se = File.separator;
        System.out.println("File.separator: " + se);
        //File.separator: \

        try {
            File file = new File("test.txt");

            boolean b1 = file.createNewFile();
            System.out.println("createNewFile(): " + b1);
            //createNewFile(): true

            boolean b2 = file.exists();
            System.out.println("exists(): " + b2);
            //exists(): true

            boolean b3 = file.canExecute();
            System.out.println("canExecute(): " + b3);
            //canExecute(): true

            boolean b4 = file.canWrite();
            System.out.println("canWrite(): " + b4);
            //canWrite(): true

            boolean b5 = file.canRead();
            System.out.println("canRead(): " + b5);
            //canRead(): true

            String ap = file.getAbsolutePath();
            System.out.println("getAbsolutePath(): " + ap);
            //getAbsolutePath(): D:\JetBrains\Project\Java_Basic_Demo\test.txt

            File af = file.getAbsoluteFile();
            System.out.println("getAbsoluteFile(): " + af);
            //getAbsoluteFile(): D:\JetBrains\Project\Java_Basic_Demo\test.txt

            String name = file.getName();
            System.out.println("getName(): " + name);
            //getName(): test.txt

            String path = file.getPath();
            System.out.println("getPath(): " + path);
            //getPath(): test.txt

            boolean b6 = file.isAbsolute();
            System.out.println("isAbsolute(): " + b6);
            //isAbsolute(): false

            boolean b7 = file.isDirectory();
            System.out.println("isDirectory(): " + b7);
            //isDirectory(): false

            boolean b8 = file.isFile();
            System.out.println("isFile(): " + b8);
            //isFile(): true

            boolean b9 = file.isHidden();
            System.out.println("isHidden(): " + b9);
            //isHidden(): false

            long lm = file.lastModified();
            System.out.println("lastModified(): " + lm);
            //lastModified(): 1613811260910

            long l = file.length();
            System.out.println("length(): " + l);
            //length(): 0

            String[] list = file.list();
            System.out.println("list(): " + Arrays.toString(list));
            //list(): null

            File[] filelist = file.listFiles();
            System.out.println("listFiles(): " + Arrays.toString(filelist));
            //listFiles(): null

            boolean b10 = file.mkdir();
            System.out.println("mkdir(): " + b10);
            //mkdir(): false

            boolean b11 = file.mkdirs();
            System.out.println("mkdirs(): " + b11);
            //mkdirs(): false

            File file1 = new File("demo.txt");
            boolean b12 = file.renameTo(file1);
            System.out.println("renameTo(new File(\"demo.txt\")): " + b12);
            //renameTo(file1): true

            boolean b13 = file1.delete();
            System.out.println("delete(): " + b13);
            //delete(): true
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
