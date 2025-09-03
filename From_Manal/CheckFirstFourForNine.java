public class CheckFirstFourForNine {
    public static boolean hasNineInFirstFour(int[] nums) {
        int lengthOfArray =Math.min(nums.length,4);
        //return true if one of the first 4 elements in the array is a 9
        for (int i = 0; i < lengthOfArray; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 9, 3, 4}));
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 3, 4, 9}));
        System.out.println(hasNineInFirstFour(new int[]{1, 2, 3, 4, 5}));
    }
}
