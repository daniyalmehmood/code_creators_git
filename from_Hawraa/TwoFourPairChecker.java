public class TwoFourPairChecker {
    public static boolean hasEitherTwoOrFourPair(int[] nums) {
        boolean hasTwoPair = false;
        boolean hasFourPair = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                hasTwoPair = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                hasFourPair = true;
            }
        }
        return hasTwoPair ^ hasFourPair; // XOR: true if only one is true
    }

    public static void main(String[] args){
        System.out.println(hasEitherTwoOrFourPair(new int[]{1, 2, 2}));
        System.out.println(hasEitherTwoOrFourPair(new int[]{4, 4, 1}));
        System.out.println(hasEitherTwoOrFourPair(new int[]{4, 4, 1, 2, 2}));
    }
}
