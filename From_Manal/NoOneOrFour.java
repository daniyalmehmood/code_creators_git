public class NoOneOrFour {
    // Method to check if the array contains no 1's or no 4's
    public static boolean hasNoOneOrNoFour(int[] numbers) {
        boolean foundOne = false;
        boolean foundFour = false;
        
        for (int num : numbers) {
            if (num == 1) {
                foundOne = true;
            }
            if (num == 4) {
                foundFour = true;
            }
        }

        // Return true if there is no 1 or no 4
        return !foundOne || !foundFour;
    }
    public static void main(String[] args) {
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3}));   
        System.out.println(hasNoOneOrNoFour(new int[]{1, 2, 3, 4}));
        System.out.println(hasNoOneOrNoFour(new int[]{2, 3, 4}));   
    }
}