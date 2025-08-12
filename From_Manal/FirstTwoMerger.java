import java.util.Arrays;
// A class that merges elements from two integer arrays
public class FirstTwoMerger {
//Combines the first two elements from each of the given arrays into a new array.
    public static int[] mergeFirstTwoElements(int[] arrayOne, int[] arrayTwo) {
        return new int[] {
            arrayOne[0], arrayOne[1],
            arrayTwo[0], arrayTwo[1]
        };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeFirstTwoElements(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(mergeFirstTwoElements(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(Arrays.toString(mergeFirstTwoElements(new int[]{9, 2}, new int[]{3, 4})));
    }
}

