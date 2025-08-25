// Array-3 > fix34
public class FixAdjacentNumbers {
    public int[] fixThreeFourPairs(int[] nums) {
        int fourIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i + 1] == 4) {
                    continue;
                }
                while (fourIndex < nums.length && nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3)) {
                    fourIndex++;
                }
                int afterThree = nums[i + 1];
                nums[i + 1] = nums[fourIndex];
                nums[fourIndex] = afterThree;
            }
        }
        return nums;
    }
}