import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test_07_6_LinkedHashMap {
    public void start() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "c");
        hashMap.put(1, "b");
        hashMap.put(0, "a");
        System.out.println("hashMap: " + hashMap);
        //hashMap: {0=a, 1=b, 2=c}

        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(20);
        linkedHashMap1.put(2, "c");
        linkedHashMap1.put(1, "b");
        linkedHashMap1.put(0, "a");
        System.out.println("linkedHashMap1: " + linkedHashMap1);
        //linkedHashMap1: {2=c, 1=b, 0=a}
    }
}
