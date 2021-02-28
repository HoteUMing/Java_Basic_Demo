import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_7_9_Collections {
    public void start() {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println("Collections.addAll(list, \"a\", \"b\",\"c\",\"d\"): " + list);
        //Collections.addAll(list, "a", "b","c","d"): [a, b, c, d, e]

        Collections.shuffle(list);
        System.out.println("Collections.shuffle(list): " + list);
        //Collections.shuffle(list): [a, d, e, c, b]

        Collections.reverse(list);
        System.out.println("Collections.reverse(list): " + list);
        //Collections.reverse(list): [b, c, e, d, a]

        Collections.replaceAll(list, "a", "f");
        System.out.println("Collections.replaceAll(list, \"a\", \"f\"): " + list);
        //Collections.replaceAll(list, "a", "f"): [b, c, e, d, f]

        Collections.rotate(list, 2);
        System.out.println("Collections.rotate(list,2): " + list);
        //Collections.rotate(list,2): [d, f, b, c, e]

        Collections.sort(list);
        System.out.println("Collections.sort(list): " + list);
        //Collections.sort(list): [b, c, d, e, f]

        Collections.fill(list, "g");
        System.out.println("Collections.fill(list,\"g\"): " + list);
        //Collections.fill(list,"g"): [g, g, g, g, g]
    }
}
