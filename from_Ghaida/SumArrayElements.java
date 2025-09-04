public class SumArrayElements {
    public static void main(String[] args) {
        System.out.println(sumNumbers(new int[]{1, 2, 3})); //6
        System.out.println(sumNumbers(new int[]{5, 11, 2})); // 18
        System.out.println(sumNumbers(new int[]{7, 0, 0})); // 7
    }
    public static int sumNumbers(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
}
