import java.util.HashMap;

public class Test_07_5_HashMap {
    public void start() {
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(20);

        String put = map1.put(0, "a");
        System.out.println("put(0, \"a\"): " + put);
        //put(0, "a"): null

        String get = map1.get(0);
        System.out.println("get(0): " + get);
        //get(0): a

        boolean b1 = map1.containsKey(0);
        System.out.println("containsKey(0): " + b1);
        //containsKey(0): true

        boolean b2 = map1.containsValue("a");
        System.out.println("containsValue(\"a\"): " + b2);
        //containsValue("a"): true

        int size = map1.size();
        System.out.println("size(): " + size);
        //size(): 1

        boolean b3 = map1.isEmpty();
        System.out.println("isEmpty(): " + b3);
        //isEmpty(): false

        String remove = map1.remove(0);
        System.out.println("remove(0): " + remove);
        //remove(0): a

        map1.clear();
    }
}
