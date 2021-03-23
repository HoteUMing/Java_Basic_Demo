public class Test_05_2_StringBuilder {
    public void start() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("01234567");

        int capacity = sb.capacity();
        System.out.println("capacity(): " + capacity);
        //capacity(): 16

        sb2.append("89");
        System.out.println("append(\"89\"): " + sb2);
        //append("89"): 0123456789

        char ca = sb2.charAt(0);
        System.out.println("charAt(0): " + ca);
        //charAt(0): 0

        sb2.delete(1, 3);
        System.out.println("delete(1, 3): " + sb2);
        //delete(1, 3): 03456789

        sb2.deleteCharAt(0);
        System.out.println("deleteCharAt(0): " + sb2);
        //deleteCharAt(0): 3456789

        int index1 = sb2.indexOf("89");
        System.out.println("indexOf(\"89\"): " + index1);
        //indexOf("89"): 5

        int index2 = sb2.lastIndexOf("89");
        System.out.println("lastIndexOf(\"89\"): " + index2);
        //lastIndexOf("89"): 5

        sb2.insert(1, "a");
        System.out.println("insert(1, \"a\"): " + sb2);
        //insert(1, "a"): 3a456789

        sb2.setLength(12);
        int length = sb2.length();
        System.out.println("length(): " + length);
        //length(): 12

        sb2.replace(0, 2, "test");
        System.out.println("replace(0, 2, \"test\"): " + sb2);
        //replace(0, 2, "test"): test456789

        sb2.setCharAt(0, 'b');
        System.out.println("setCharAt(0,'b'): " + sb2);
        //setCharAt(0,'b'): best456789

        sb2.reverse();
        System.out.println("reverse(): " + sb2);
        //reverse():     987654tseb

        String str1 = sb2.substring(5);
        System.out.println("substring(5): " + str1);
        //substring(3): 87654tseb

        String str2 = sb2.substring(0, 6);
        System.out.println("substring(0, 6): " + str2);
        //substring(0, 6):     98

        sb2.trimToSize();
        System.out.println("trimToSize(): " + sb2);
        //trimToSize():     987654tseb
    }
}
