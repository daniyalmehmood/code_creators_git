import java.util.Arrays;

// Array-2 > fizzArray
public class ArrayBuilder {
    public static int[] createIndexArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createIndexArray(4)));
        System.out.println(Arrays.toString(createIndexArray(1)));
        System.out.println(Arrays.toString(createIndexArray(10)));
    }
}
