public class MiniArrayMaker {
    public static int[] ArrayFrontSlicer(int[] nums) {
        int newArrayLength = Math.min(2, nums.length);
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }
}