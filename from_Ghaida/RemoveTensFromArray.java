import java.util.Arrays;

public class RemoveTensFromArray {//Array-2 > withoutTen
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeTens(new int[]{1, 10, 10, 2})));// → [1, 2, 0, 0]
        System.out.println(Arrays.toString(removeTens(new int[]{10, 2, 10})));// → [2, 0, 0]
        System.out.println(Arrays.toString(removeTens(new int[]{1, 99, 10})));// → [1, 99, 0]
    }
    public static int[] removeTens(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[index++] = nums[i];
            }
        }
        return result;
    }
}