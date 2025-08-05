public class FirstLastSixChecker {
    public static boolean isfirstOrLastElementSix(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
    public static void main(String[] args) {
        System.out.println(isfirstOrLastElementSix(new int[]{1, 2, 6}));
        System.out.println(isfirstOrLastElementSix(new int[]{6, 1, 2, 3}));
        System.out.println(isfirstOrLastElementSix(new int[]{13, 6, 1, 2, 3}));
    }

}
