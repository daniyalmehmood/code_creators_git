import java.util.Arrays;

public class ArrayCombiner {//Array-1 > make2
    public static void main(String[] args) {
        System.out.println(Arrays.toString(combineTwoArrays(new int[]{4, 5}, new int[]{1, 2, 3}))); // → [4, 5]
        System.out.println(Arrays.toString(combineTwoArrays(new int[]{4}, new int[] {1, 2, 3})));    // → [4, 1]
        System.out.println(Arrays.toString(combineTwoArrays(new int[]{}, new int[]{1, 2})));         // → [1, 2]
    }

    public static int[] combineTwoArrays(int[] a, int[] b) {
        int[] combinedArray = new int[2];
        int index = 0;
        //add elements from array a
        for (int i = 0; i < a.length && index < 2; i++) {
            combinedArray[index++] = a[i];
        }
        //add elements from array b
        for (int i = 0; i < b.length && index < 2; i++) {
            combinedArray[index++] = b[i];
        }
        return combinedArray;
    }
}