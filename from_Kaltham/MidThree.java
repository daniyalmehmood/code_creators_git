public class MidThree {
    public int[]midThree(int[]nums) {

        int lenghtOfNums = nums.length / 2;
        return new int[]{
            nums[lenghtOfNums - 1],
            nums[lenghtOfNums],
            nums[lenghtOfNums + 1]
        };

    }
}