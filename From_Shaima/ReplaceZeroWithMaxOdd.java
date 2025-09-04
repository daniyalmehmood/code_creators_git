import java.util.Arrays;
public class ReplaceZeroWithMaxOdd {
    public static int[] replaceZerosWithLargestOddToRight(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // go through the array
            if (nums[i] == 0) { // check 0's
                int largestOdd = 0;
                for (int j = i + 1; j < nums.length; j++) { // check elements after 0
                    if (nums[j] % 2 != 0) { //check if odd
                        if (largestOdd < nums[j]) {
                            largestOdd = nums[j]; //make 0 be the largest odd value
                        }
                    }
                }
                nums[i] = largestOdd;//make 0 be the largest odd value
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] result = replaceZerosWithLargestOddToRight(new int[]{0, 5, 0, 3});
        System.out.println(Arrays.toString(result));
    }
}
