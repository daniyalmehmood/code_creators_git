public class SumOfTwosChecker {
    public static boolean isSumOfTwosEight(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) { // go through the array to search for element 2 in the array
            if (nums[i] == 2) {
                count += 2; // add 2 to the counting variable
            }
        }
        if (count == 8) return true; // the sum of 2 in the array is 8
        return false; // the sum may be more than or less than 8
    }
    public static void main(String[] args) {
        System.out.println(isSumOfTwosEight(new int[]{2, 3, 2, 2, 4, 2, 2}));
    }
}
