public class ShiftLeft {
    public static int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) return nums;
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(shiftLeft(new int[]{1})));
    }
}