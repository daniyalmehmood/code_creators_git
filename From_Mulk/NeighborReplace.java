//Array-2 > notAlone
public class NeighborReplace {
    public int[] replaceLonelyValWithMaxNeighbor(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            int middleValue = nums[nums.length / 2];
            if (i > 0 && i < nums.length - 1) {
                if (middleValue == nums[i] && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    nums[i] = Math.max(nums[i + 1], nums[i - 1]);
                }
            }
        }
        return nums;
    }
}