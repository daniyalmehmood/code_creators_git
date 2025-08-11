public class UnluckyPairChecker {
    public static boolean hasUnlucky13Pair(int[] nums) {
        if (nums.length >=2){ // check the array length
            if (nums[0]==1 && nums[1]==3 || // check the first 3 elements and last 2 elements in the array  is 1 followed by 3
                    nums[1]==1 && nums[2]==3 ||
                    nums[nums.length-2]==1 && nums[nums.length-1]==3){
                return true; // return true while the condition is acceptable
            }
        }
        return false; // otherwise return false
    }
    public static void main(String[] args) {
        System.out.println(hasUnlucky13Pair(new int[]{1, 3, 4, 5}));
        System.out.println(hasUnlucky13Pair(new int[]{1, 1, 2, 1}));
    }
}
