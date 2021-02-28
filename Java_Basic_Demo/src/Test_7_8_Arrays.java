import java.util.Arrays;

public class Test_7_8_Arrays {
    public void start() {
        int[] num = new int[]{8, 9, 4, 7, 6, 3, 2, 5, 1, 0};
        System.out.println("num: " + Arrays.toString(num));
        //num: [8, 9, 4, 7, 6, 3, 2, 5, 1, 0]

        Arrays.sort(num, 0, 5);
        System.out.println("Arrays.sort(num,0,5): " + Arrays.toString(num));
        //Arrays.sort(num,0,5): [4, 6, 7, 8, 9, 3, 2, 5, 1, 0]

        Arrays.sort(num);
        System.out.println("Arrays.sort(num): " + Arrays.toString(num));
        //Arrays.sort(num): [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        Arrays.fill(num, 0, 5, 0);
        System.out.println("Arrays.fill(num,0,5,0): " + Arrays.toString(num));
        //Arrays.fill(num,0,5,0): [0, 0, 0, 0, 0, 5, 6, 7, 8, 9]

        Arrays.fill(num, 1);
        System.out.println("Arrays.fill(num,1): " + Arrays.toString(num));
        //Arrays.fill(num,1): [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
    }
}
