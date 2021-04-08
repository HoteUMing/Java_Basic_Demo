import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_07_5_HashMap {
    public void start() {
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(20);

        map2.put(0, "hello");
        map2.put(1, "world");
        map2.put(2, "key");
        map2.put(3, "value");

        //遍历HashMap的方法-1
        Set<Integer> keys = map2.keySet();
        Iterator<Integer> iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            Integer key = iterator1.next();
            System.out.println("map2.keySet(): " + key + " = " + map2.get(key));
            //map2.keySet(): 0 = hello
            //map2.keySet(): 1 = world
            //map2.keySet(): 2 = key
            //map2.keySet(): 3 = value
        }
        //遍历HashMap的方法-2
        Set<Map.Entry<Integer, String>> entrys = map2.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = entrys.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry = iterator2.next();
            System.out.println("map2.entrySet(): " + entry.getKey() + " = " + entry.getValue());
            //map2.entrySet(): 0 = hello
            //map2.entrySet(): 1 = world
            //map2.entrySet(): 2 = key
            //map2.entrySet(): 3 = value
        }

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
