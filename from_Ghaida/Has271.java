public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[] {1, 2, 7, 1})); // → true
        System.out.println(has271(new int[] {1, 2, 8, 1})); // → false
        System.out.println(has271(new int[] {2, 7, 1})); // → true
    }
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5) {
                int num1 = nums[i] - 1;
                int num2 = nums[i + 2];
                if (Math.abs(num2 - num1) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
