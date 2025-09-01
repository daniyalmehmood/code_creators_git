public class ArrayProcessor {
        public int[] makeDoubleLast(int[] nums) {

            // Step 1: Create a new array with double the length of nums
            int[] result = new int[nums.length * 2];

            // Step 2: Set the last element of the new array to be the last element of the original array
            result[result.length - 1] = nums[nums.length - 1];

            // Step 3: Return the new array
            return result;
        }
    }

