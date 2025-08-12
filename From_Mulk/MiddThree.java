public class MiddThree {
    public int[] getCenterThreeElements(int[] nums) {
        if (nums.length >= 3) {
            int middleOne = nums[nums.length / 2];
            int middleTwo = nums[nums.length / 2 - 1];
            int middleThree = nums[nums.length / 2 + 1];
            return new int[]{middleTwo, middleOne, middleThree};
        }
        return new int[0];
    }
}

