public class Pre4 {
    public static int[] pre4(int[] nums) {
        int four = 0;
        while (nums[four] != 4) four++;
        int[] res = new int[four];
        for (int i = 0; i < four; i++) res[i] = nums[i];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(pre4(new int[]{1, 2, 4, 1})));
        System.out.println(java.util.Arrays.toString(pre4(new int[]{3, 1, 4})));
        System.out.println(java.util.Arrays.toString(pre4(new int[]{1, 4, 4})));
    }
}