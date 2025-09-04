import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseElements(new int[]{1, 2, 3})));// → [3, 2, 1]
        System.out.println(Arrays.toString(reverseElements(new int[]{5, 11, 9})));// → [9, 11, 5];
        System.out.println(Arrays.toString(reverseElements(new int[]{7, 0, 0})));// → [0, 0, 7];
    }
    public static int[] reverseElements(int[] nums) {
        int[] reversedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversedArray[nums.length - 1 - i] = nums[i];
        }
        return reversedArray;
    }
}
