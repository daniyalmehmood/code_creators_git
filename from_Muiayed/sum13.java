public class sum13 {
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) continue;
            if (i > 0 && nums[i - 1] == 13) continue;
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13(new int[]{1, 1}));
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));
    }
}