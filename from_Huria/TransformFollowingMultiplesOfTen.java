import java.util.Arrays;

public class TransformFollowingMultiplesOfTen {
    public static int[] replaceFollowingValuesWithLastMultipleOfTen(int[] nums) {
        Integer multipleOften = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) { // check if the element is a 10,20,30,...
                multipleOften = nums[i]; //update the value of multipleOften
            }
            if (multipleOften != -1) {
                nums[i] = multipleOften;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceFollowingValuesWithLastMultipleOfTen(new int[]{2, 10, 3, 4, 20, 5})));
        System.out.println(Arrays.toString(replaceFollowingValuesWithLastMultipleOfTen(new int[]{10, 1, 20, 2})));
        System.out.println(Arrays.toString(replaceFollowingValuesWithLastMultipleOfTen(new int[]{10, 1, 9, 20})));
    }
}
