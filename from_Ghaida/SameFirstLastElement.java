public class SameFirstLastElement {
    public static void main(String[] args) {
        System.out.println(isSameFirstLastElement(new int[]{1, 2, 3}));// → false
        System.out.println(isSameFirstLastElement(new int[]{1, 2, 3, 1}));// → true
        System.out.println(isSameFirstLastElement(new int[]{1, 2, 1}));// → true
    }

    public static boolean isSameFirstLastElement(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        return nums[0] == nums[nums.length - 1];
    }
}
