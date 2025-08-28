public class TenRun {
    public static int[] tenRun(int[] nums) {
        int cur = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                cur = nums[i];
            } else if (cur != -1) {
                nums[i] = cur;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{10, 1, 20, 2})));
        System.out.println(java.util.Arrays.toString(tenRun(new int[]{10, 1, 9, 20})));
    }
}