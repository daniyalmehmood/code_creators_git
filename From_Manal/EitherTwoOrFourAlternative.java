//Array-2 > either24

public class EitherTwoOrFourAlternative {
    public static boolean hasEitherAdjacentTwosOrFours(int[] numbers) {
        int twosPairsCount = 0;
        int foursPairsCount = 0;

        // Count consecutive 2's and 4's
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 2 && numbers[i + 1] == 2) {
                twosPairsCount++;
            }
            if (numbers[i] == 4 && numbers[i + 1] == 4) {
                foursPairsCount++;
            }
        }

        // True if we found at least one of them, but not both
        return (twosPairsCount > 0 && foursPairsCount == 0)
                || (foursPairsCount > 0 && twosPairsCount == 0);
    }

    // Test the method
    public static void main(String[] args) {
        System.out.println(hasEitherAdjacentTwosOrFours(new int[]{1, 2, 2}));       
        System.out.println(hasEitherAdjacentTwosOrFours(new int[]{4, 4, 1}));      
        System.out.println(hasEitherAdjacentTwosOrFours(new int[]{4, 4, 1, 2, 2}));
        System.out.println(hasEitherAdjacentTwosOrFours(new int[]{1, 2, 1}));      
    }
}