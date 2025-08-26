public class EitherTwoPairOrFourPairChecker {//Array-2 > either24
    public static void main(String[] args) {
        System.out.println(checkEitherTwoOrFour(new int[]{1, 2, 2}));// → true
        System.out.println(checkEitherTwoOrFour(new int[]{4, 4, 1}));// → true
        System.out.println(checkEitherTwoOrFour(new int[]{4, 4, 1, 2, 2}));// → false
    }
    public static boolean checkEitherTwoOrFour(int[] nums) {
        boolean hasTwo = false;
        boolean hasFour = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i + 1] == 2){
                hasTwo = true;
            }
            if(nums[i] == 4 && nums[i + 1] == 4){
                hasFour = true;
            }
        }
        return hasTwo != hasFour;
    }
}