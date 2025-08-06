public class ArrayMiddleExtractor {
    //Returns a new array containing the middle three elements of an odd-length array.
    public static int[] extractMiddleThree(int[] nums) {
        int[] newArray = new int[3];
        newArray[0] = nums[nums.length / 2 - 1];
        newArray[1] = nums[nums.length / 2];
        newArray[2] = nums[nums.length / 2 + 1];
        return newArray;
    }
}
