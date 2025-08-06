public class MakeMiddle {
    public int[] extractMiddlePair(int[] nums) {
        int middleOne = nums[nums.length / 2];
        int middleTwo = nums[nums.length / 2 - 1];
        if (nums.length >= 2) {
            return new int[]{middleTwo, middleOne};
        }
        return new int[0];
    }
}