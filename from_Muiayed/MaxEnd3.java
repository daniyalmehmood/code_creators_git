public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    public static void main(String[] args) {
        MaxEnd3 me = new MaxEnd3();
        int[] out = me.maxEnd3(new int[]{1, 2, 3});
        System.out.println(out[0] + " " + out[1] + " " + out[2]); // 3 3 3
    }
}