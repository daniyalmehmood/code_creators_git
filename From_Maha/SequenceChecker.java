public class SequenceChecker {

   // Checks if the array contains the sequence 1, 2, 3 in consecutive positions.

 //return true if the sequence 1, 2, 3 appears; false otherwise

    public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}
