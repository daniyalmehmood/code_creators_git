public class ArrayReplace {
        public int[] replace3After2(int[]nums) {
            // Step 1: If first element is 2 and second is 3, set second element to 0
            if (nums[0]== 2 && nums[1]== 3) {
                nums[1] = 0;
            }
            // Step 2: If second element is 2 and third is 3, set third element to 0
            if (nums[1]== 2 && nums[2]== 3) {
                nums[2]= 0;
            }
            // Step 3: Return the modified array
            return nums;
        }
    }

