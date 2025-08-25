public class maxSpan {
    public static int maxSpan(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int last = i;
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == val) {
                    last = j;
                    break;
                }
            }
            max = Math.max(max, last - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}