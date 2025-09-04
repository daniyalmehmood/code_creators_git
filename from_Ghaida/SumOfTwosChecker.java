public class SumOfTwosChecker {//Array-2 > sum28
    public static void main(String[] args) {
        System.out.println(checkSumOfTwosEqualEight(new int[]{2, 3, 2, 2, 4, 2}));// → true
        System.out.println(checkSumOfTwosEqualEight(new int[]{2, 3, 2, 2, 4, 2, 2}));// → false
        System.out.println(checkSumOfTwosEqualEight(new int[]{1, 2, 3, 4}));// → false
    }
    public static boolean checkSumOfTwosEqualEight(int[] nums) {
        int sumOfTwos = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2){
                sumOfTwos += 2;
            }
        }
        return sumOfTwos == 8;
    }
}