public class ArrayCenterExtractor {
 //Extracts the middle two elements from an even-length array.
    public int[] extractMiddleTwoElements(int[] nums) {
        int mid = nums.length / 2;
        return new int[] { nums[mid - 1], nums[mid] };
    }
}
