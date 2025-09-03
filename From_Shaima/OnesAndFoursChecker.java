public class OnesAndFoursChecker {
    public static boolean containsOnlyOnesAndFours(int[] nums) {
        for (int i=0 ; i<nums.length ; i++){ // use for loop to go through the array
            if (nums[i]!=1 && nums[i]!=4){ // if there is any number neither 1 nor 4
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(containsOnlyOnesAndFours(new int[]{1, 4, 2, 4}));
    }
}
