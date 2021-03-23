import java.util.HashSet;

public class Test_07_3_HashSet {
    public void start() {
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>(20);

        boolean b1 = hashSet1.add("a");
        System.out.println("add(\"a\"): " + b1);
        //add("a"): true

        boolean b2 = hashSet1.add("a");
        System.out.println("add(\"a\"): " + b2);
        //add("a"): false

        boolean b3 = hashSet1.contains("a");
        System.out.println("contains(\"a\"): " + b3);
        //contains("a"): true

        boolean b4 = hashSet1.isEmpty();
        System.out.println("isEmpty(): " + b4);
        //isEmpty(): false

        boolean b5 = hashSet1.remove("a");
        System.out.println("remove(\"a\"): " + b5);
        //remove("a"): true

        int size = hashSet1.size();
        System.out.println("size(): " + size);
        //size(): 0

        hashSet1.clear();
    }
}
