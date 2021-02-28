import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test_7_4_LinkedHashSet {
    public void start() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("c");
        hashSet.add("b");
        hashSet.add("a");
        System.out.println("hashSet: " + hashSet);
        //hashSet: [a, b, c]

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>(20);
        linkedHashSet1.add("c");
        linkedHashSet1.add("b");
        linkedHashSet1.add("a");
        System.out.println("linkedHashSet1: " + linkedHashSet1);
        //linkedHashSet1: [c, b, a]
    }
}
