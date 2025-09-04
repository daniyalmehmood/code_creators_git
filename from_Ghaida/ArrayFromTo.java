import java.util.Arrays;

public class ArrayFromTo {//Array-2 > fizzArray3
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createSequenceFromTo(5, 10)));// → [5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(createSequenceFromTo(11, 18)));// → [11, 12, 13, 14, 15, 16, 17]
        System.out.println(Arrays.toString(createSequenceFromTo(1, 3)));// → [1, 2]
    }
    public static int[] createSequenceFromTo(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            result[i] = start + i;
        }
        return result;
    }
}