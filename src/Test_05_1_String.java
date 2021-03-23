import java.util.Arrays;

public class Test_05_1_String {
    public void start() {
        String str1 = "测试a";
        System.out.println(str1);
        //测试a

        String str2 = new String(new byte[]{97, 98, 99, 100, 101});
        System.out.println(str2);
        //abcde

        String str3 = new String(new byte[]{97, 98, 99, 100, 101}, 1, 3);
        System.out.println(str3);
        //bcd

        String str4 = new String(new char[]{'a', 'b', 'c', 'd', 'e'});
        System.out.println(str4);
        //abcde

        String str5 = new String(new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3);
        System.out.println(str5);
        //bcd

        char ca = str1.charAt(0);
        System.out.println("charAt(0): " + ca);
        //charAt(0): 测

        str1 = str1.concat(".测试b");
        System.out.println("concat(\".测试b\"): " + str1);
        //concat(".测试b"): 测试a.测试b

        boolean b1 = str1.contains("测试");
        System.out.println("contains(\"测试\"): " + b1);
        //contains("测试"): true

        boolean b2 = str1.equals("测试A.测试B");
        System.out.println("equals(\"测试A.测试B\"): " + b2);
        //equals("测试A.测试B"): false

        boolean b3 = str1.equalsIgnoreCase("测试A.测试B");
        System.out.println("equalsIgnoreCase(\"测试A.测试B\"): " + b3);
        //equalsIgnoreCase("测试A.测试B"): true

        boolean b4 = str1.startsWith("测试");
        System.out.println("startsWith(\"测试\"): " + b4);
        //startsWith("测试"): true

        boolean b5 = str1.endsWith("测试");
        System.out.println("endsWith(\"测试\"): " + b5);
        //endsWith("测试"): false

        byte[] bt = str1.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bt));
        //getBytes(): [-26, -75, -117, -24, -81, -107, 97, 46, -26, -75, -117, -24, -81, -107, 98]

        char[] chars = str1.toCharArray();
        System.out.println("toCharArray(): " + Arrays.toString(chars));
        //toCharArray(): [测, 试, a, ., 测, 试, b]

        int index1 = str1.indexOf('a');
        System.out.println("indexOf('a'): " + index1);
        //indexOf('a'): 2

        int index2 = str1.indexOf("测试");
        System.out.println("indexOf(\"测试\"): " + index2);
        //indexOf("测试"): 0

        int index3 = str1.lastIndexOf('a');
        System.out.println("lastIndexOf('a'): " + index3);
        //lastIndexOf('a'): 2

        int index4 = str1.lastIndexOf("测试");
        System.out.println("lastIndexOf(\"测试\"): " + index4);
        //lastIndexOf("测试"): 4

        boolean b6 = str1.isEmpty();
        System.out.println("isEmpty(): " + b6);
        //isEmpty(): false

        boolean b7 = str1.isBlank();
        System.out.println("isBlank(): " + b7);
        //isBlank(): false

        int length = str1.length();
        System.out.println("length(): " + length);
        //length(): 7

        str1 = str1.repeat(2);
        System.out.println("repeat(2): " + str1);
        //repeat(2): 测试a.测试b测试a.测试b

        str1 = str1.replace("测试", "测验");
        System.out.println("replace(\"测试\", \"测验\"): " + str1);
        //replace("测试", "测验"): 测验a.测验b测验a.测验b

        String[] strs = str1.split("\\.");
        System.out.println("str1.split(\"\\\\.\"): " + Arrays.toString(strs));
        //str1.split("\\."): [测验a, 测验b测验a, 测验b]

        str1 = str1.substring(1);
        System.out.println("substring(1): " + str1);
        //substring(1): 验a.测验b测验a.测验b

        str1 = str1.substring(1, 4);
        System.out.println("substring(1, 4): " + str1);
        //substring(1, 4): a.测

        str1 = str1.trim();
        System.out.println("trim(): " + str1);
        //trim(): a.测

        String str6 = String.valueOf(123456789);
        System.out.println("valueOf : " + str6);
        //valueOf : 123456789
    }
}
