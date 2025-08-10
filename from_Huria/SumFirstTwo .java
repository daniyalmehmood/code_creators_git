public class SumFirstTwo {
    public static int sumFirstTwo(int[] nums) {
        int sum = 0;
        if (nums.length >= 2) {
            sum = nums[0] + nums[1];
            return sum;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstTwo(new int[]{1, 2, 3}));
        System.out.println(sumFirstTwo(new int[]{1, 1}));
        System.out.println(sumFirstTwo(new int[]{1, 1, 1, 1}));
        System.out.println(sumFirstTwo(new int[]{1}));
        System.out.println(sumFirstTwo(new int[]{}));
    }
}