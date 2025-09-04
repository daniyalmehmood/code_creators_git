public class NoOneOrThreeChecker {//Array-2 > lucky13
    public static void main(String[] args) {
        System.out.println(checkLuckyThirteen(new int[]{0, 2, 4}));// → true
        System.out.println(checkLuckyThirteen(new int[]{1, 2, 3}));// → false
        System.out.println(checkLuckyThirteen(new int[]{1, 2, 4}));// → false
    }
    public static boolean checkLuckyThirteen(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }
}