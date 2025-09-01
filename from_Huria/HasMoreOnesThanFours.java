public class HasMoreOnesThanFours {
    public static boolean isCountOfOnesGreaterThanFours(int[] nums) {
        int numberOfOnes = 0;
        int numberOfFours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numberOfOnes++;
            }
            if (nums[i] == 4) {
                numberOfFours++;
            }
        }
        if (numberOfOnes > numberOfFours) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCountOfOnesGreaterThanFours(new int[]{1, 4, 1}));
        System.out.println(isCountOfOnesGreaterThanFours(new int[]{1, 4, 1, 4}));
        System.out.println(isCountOfOnesGreaterThanFours(new int[]{1, 1}));
    }
}