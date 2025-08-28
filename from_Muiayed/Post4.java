public class Post4 {
    public static int[] post4(int[] nums) {
        int last4 = nums.length - 1;
        while (nums[last4] != 4) last4--;
        int len = nums.length - last4 - 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) res[i] = nums[last4 + 1 + i];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(post4(new int[]{2, 4, 1, 2})));
        System.out.println(java.util.Arrays.toString(post4(new int[]{4, 1, 4, 2})));
        System.out.println(java.util.Arrays.toString(post4(new int[]{4, 4, 1, 2, 3})));
    }
}