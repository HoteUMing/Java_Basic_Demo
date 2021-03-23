import java.util.ArrayList;

public class Test_07_1_ArrayList {
    public void start() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(20);

        boolean b1 = list1.add("a");
        System.out.println("add(\"a\"): " + b1);
        //add("a"): true

        list1.add(0, "b");
        System.out.println("add(0, \"b\"): " + list1);
        //add(0, "b"): [b, a]

        boolean b2 = list1.contains("c");
        System.out.println("contains(\"c\"): " + b2);
        //contains("c"): false

        String str = list1.get(0);
        System.out.println("get(0): " + str);
        //get(0): b

        int index1 = list1.indexOf("a");
        System.out.println("indexOf(\"a\"): " + index1);
        //indexOf("a"): 1

        int index2 = list1.lastIndexOf("b");
        System.out.println("lastIndexOf(\"b\"): " + index2);
        //lastIndexOf("b"): 0

        boolean b3 = list1.isEmpty();
        System.out.println("isEmpty(): " + b3);
        //isEmpty(): false

        String rstr = list1.remove(0);
        System.out.println("remove(0): " + rstr);
        //remove(0): b

        boolean b4 = list1.remove("b");
        System.out.println("remove(\"b\"): " + b4);
        //remove("b"): false

        String sstr = list1.set(0, "test");
        System.out.println("set(0, \"test\"): " + sstr);
        //set(0, "test"): a

        list1.trimToSize();
        int size = list1.size();
        System.out.println("size(): " + size);
        //size(): 1

        list1.clear();
    }
}
