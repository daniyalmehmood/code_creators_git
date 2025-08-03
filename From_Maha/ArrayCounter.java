public class ArrayCounter {


     // Counts the number of times the value 6 is followed by either 6 or 7 in the array.


    public int countSixSixOrSixSeven(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 6 && nums[i + 1] == 6) || (nums[i] == 6 && nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }
}
