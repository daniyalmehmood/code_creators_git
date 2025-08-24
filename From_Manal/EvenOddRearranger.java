// Array-2 > evenOdd
import java.util.Arrays;
public class EvenOddRearranger {

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length]; // Create a new array to store the result
        int evenIndex = 0;                   // Index to place even numbers from the start
        int oddIndex = nums.length - 1;      // Index to place odd numbers from the end

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;    // Place even number at the current evenIndex
                evenIndex++;
            } else {
                result[oddIndex] = num;     // Place odd number at the current oddIndex
                oddIndex--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));
    }
}