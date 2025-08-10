public class SumThreeNumbers {
    public static int sumThree(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        System.out.println(sumThree(new int[]{1, 2, 3}));
        System.out.println(sumThree(new int[]{7, 0, 0}));
        System.out.println(sumThree(new int[]{5, 11, 2}));
    }
}
