// Array-2 > lucky13
public class ArrayWithoutOneOrThree {
    public static boolean withoutOneOrThree(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(withoutOneOrThree(new int[]{0, 2, 4}));
        System.out.println(withoutOneOrThree(new int[]{1, 2, 3}));
        System.out.println(withoutOneOrThree(new int[]{1, 2, 4}));
    }
}
