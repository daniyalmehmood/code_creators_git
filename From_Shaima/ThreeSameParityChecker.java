public class ThreeSameParityChecker {
    public static boolean hasThreeConsecutiveSameParity(int[] nums) {
        for (int i=0 ; i< nums.length-2 ; i++){
            if (nums[i]%2 == nums[i+1]%2 && nums[i]%2==nums[i+2]%2) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasThreeConsecutiveSameParity(new int[]{2, 1, 3, 5}));
    }
}
