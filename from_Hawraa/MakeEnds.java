import java.util.Arrays;

public class MakeEnds {
    public static int[] firstAndLast(int[] nums) {
        int[] array = new int[2];
        if (nums.length >= 1) {
            array[0] = nums[0];
            array[1] = nums[nums.length - 1]; // last element in array
            return array;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLast(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(firstAndLast(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(firstAndLast(new int[]{7, 4, 6, 2})));
    }
}
