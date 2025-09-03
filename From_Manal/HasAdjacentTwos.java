//Array-2 > has22

public class HasAdjacentTwos {

    public static boolean hasAdjacentTwos(int[] numbers) {
        // Loop through the array, checking each element with the next one
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 2 && numbers[i + 1] == 2) {
                return true; // Found two consecutive 2's
            }
        }
        return false; // No consecutive 2's found
    }

    // Test the method
    public static void main(String[] args) {
        System.out.println(hasAdjacentTwos(new int[]{1, 2, 2}));
        System.out.println(hasAdjacentTwos(new int[]{1, 2, 1, 2}));
        System.out.println(hasAdjacentTwos(new int[]{2, 1, 2}));
    }
}
