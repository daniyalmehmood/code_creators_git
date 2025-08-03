public class SumThree {
    public static int sumthree(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        System.out.println(sumthree(new int[]{1, 2, 3}));
        System.out.println(sumthree(new int[]{5, 11, 2}));
        System.out.println(sumthree(new int[]{7, 0, 0}));
    }
}
