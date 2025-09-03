import java.util.Arrays;

public class ArrayMerger {

    // This method returns a new array of length 2 using elements from a and then b
    public static int[] makeTwoFromArrays(int[] a, int[] b) {
        int[] result = new int[2];  // New array of size 2
        int index = 0;              // Track how many elements we've added

        // Add from array 'a'
        for (int i = 0; i < a.length && index < 2; i++) {
            result[index] = a[i];
            index++;
        }

        // Add from array 'b' if needed
        for (int i = 0; i < b.length && index < 2; i++) {
            result[index] = b[i];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeTwoFromArrays(new int[] {4, 5}, new int[] {1, 2, 3}))); // [4, 5]
        System.out.println(Arrays.toString(makeTwoFromArrays(new int[] {4}, new int[] {1, 2, 3})));    // [4, 1]
        System.out.println(Arrays.toString(makeTwoFromArrays(new int[] {}, new int[] {1, 2})));        // [1, 2]
    }
}