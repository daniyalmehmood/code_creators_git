public class Sum2 {
    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    public static void main(String[] args) {
        Sum2 s = new Sum2();
        System.out.println(s.sum2(new int[]{1, 2, 3}));  // 3
        System.out.println(s.sum2(new int[]{1, 1}));     // 2
        System.out.println(s.sum2(new int[]{1}));        // 1
        System.out.println(s.sum2(new int[]{}));         // 0
    }
}