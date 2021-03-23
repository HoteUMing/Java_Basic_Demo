import java.util.LinkedList;

public class Test_07_2_LinkedList {
    public void start() {
        LinkedList<String> linked = new LinkedList<>();

        boolean b1 = linked.add("a");
        System.out.println("add(\"a\"): " + b1);
        //add("a"): true

        linked.add(0, "b");
        System.out.println("add(0,\"b\"): " + linked);
        //add(0,"b"): [b, a]

        linked.addFirst("c");
        System.out.println("addFirst(\"c\"): " + linked);
        //addFirst("c"): [c, b, a]

        linked.addLast("d");
        System.out.println("addLast(\"d\"): " + linked);
        //addLast("d"): [c, b, a, d]

        boolean b2 = linked.contains("a");
        System.out.println("contains(\"a\"): " + b2);
        //contains("a"): true

        String str1 = linked.element();
        System.out.println("element(): " + str1);
        //element(): c

        String str2 = linked.peek();
        System.out.println("peek(): " + str2);
        //peek(): c

        String str3 = linked.get(1);
        System.out.println("get(1): " + str3);
        //get(1): b

        String first = linked.getFirst();
        System.out.println("getFirst(): " + first);
        //getFirst(): c

        String last = linked.getLast();
        System.out.println("getLast(): " + last);
        //getLast(): d

        int index1 = linked.indexOf("a");
        System.out.println("indexOf(\"a\"): " + index1);
        //indexOf("a"): 2

        int index2 = linked.lastIndexOf("b");
        System.out.println("lastIndexOf(\"b\"): " + index2);
        //lastIndexOf("b"): 1

        String pop = linked.pop();
        System.out.println("pop(): " + pop);
        //pop(): c

        linked.push("e");
        System.out.println("push(\"e\"): " + linked);
        //push("e"): [e, b, a, d]

        String set = linked.set(1, "f");
        System.out.println("set(1, \"f\"): " + set);
        //set(1, "f"): b

        String r1 = linked.remove();
        System.out.println("remove(): " + r1);
        //remove(): e

        String r2 = linked.remove(1);
        System.out.println("remove(1): " + r2);
        //remove(1): a

        String r3 = linked.removeFirst();
        System.out.println("removeFirst(): " + r3);
        //removeFirst(): f

        String r4 = linked.removeLast();
        System.out.println("removeLast(): " + r4);
        //removeLast(): d

        int size = linked.size();
        System.out.println("size(): " + size);
        //size(): 0

        boolean b3 = linked.isEmpty();
        System.out.println("isEmpty(): " + b3);
        //isEmpty(): true

        linked.clear();
    }
}
