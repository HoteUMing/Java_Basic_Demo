import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Test_07_7_Iterator {
    public void start() {
        Collection<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next(): " + iterator.next());
            //iterator.next(): a
            //iterator.next(): b
            //iterator.next(): c
            //iterator.next(): d
        }
    }
}
