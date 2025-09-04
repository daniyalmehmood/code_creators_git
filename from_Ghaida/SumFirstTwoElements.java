public class SumFirstTwoElements {
    public static void main(String[] args) {
        System.out.println(sumFirstTwoElements(new int[]{1, 2, 3}));// → 3
        System.out.println(sumFirstTwoElements(new int[] {1, 1}));// → 2
        System.out.println(sumFirstTwoElements(new int[] {1, 1, 1, 1}));// → 2
    }
    public static int sumFirstTwoElements(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        else if (nums.length == 0) {
            return 0;
        }
        return nums[0] + nums[1];
    }
}
