//Array-2 > matchUp
public class ArrayDifferenceCounter {
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count;
    }

}
