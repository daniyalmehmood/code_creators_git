public class NoTwoThreeChecker {
    public static boolean containsNoTwoOrThree(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3||  // check there is no 2 or 3 in the array "Note the array length is 2"
                nums[1] == 2 || nums[1] == 3 )
        {
            return false; //there is 2 or 3 in the array
        }
        return true; //no 2 or 3 in the array
    }

    public static void main(String[] args) {
        System.out.println(containsNoTwoOrThree(new int[]{1, 2}));
        System.out.println(containsNoTwoOrThree(new int[]{4, 5}));
    }
}
