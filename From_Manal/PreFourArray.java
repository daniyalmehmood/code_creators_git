//Array-2 > pre4 Task

import java.util.Arrays;

public class PreFourArray {

    public static int[] preFour(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 4) {
                break; 
            }
            count++;
        }

        // Create a new array to hold elements before the first 4
        int[] result = new int[count];

        // Copy elements before the first 4 into the result array
        for (int i = 0; i < count; i++) {
            result[i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(preFour(new int[]{1, 2, 4, 1}))); 
        System.out.println(Arrays.toString(preFour(new int[]{3, 1, 4})));   
        System.out.println(Arrays.toString(preFour(new int[]{1, 4, 4})));    
        System.out.println(Arrays.toString(preFour(new int[]{4, 1, 2})));    
    }
}