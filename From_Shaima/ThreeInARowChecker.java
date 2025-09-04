public class ThreeInARowChecker {
    public static boolean hasTripleIncreasing(int[] nums) {
        for (int i=0 ; i<nums.length-2 ; i++){
            if (nums[i+1]==nums[i]+1 && nums[i+2]==nums[i+1]+1) return true; // check if there is three increasing adjacent numbers like 2,3,4
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTripleIncreasing(new int[]{4, 2, 2, 3}));
    }
}
