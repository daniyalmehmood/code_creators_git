import java.util.Arrays;

public class EvensThenOdds {//Array-2 > evenOdd
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveEvensBeforeOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));// → [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(moveEvensBeforeOdd(new int[]{3, 3, 2})));// → [2, 3, 3]
        System.out.println(Arrays.toString(moveEvensBeforeOdd(new int[]{2, 2, 2})));// → [2, 2, 2]
    }

    public static int[] moveEvensBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                result[evenIndex++] = nums[i];
            }
            else{
                result[oddIndex--] = nums[i];
            }
        }
        return result;
    }
}