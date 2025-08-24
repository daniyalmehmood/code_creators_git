// Array-2 > matchUp
public class CountCloseValues {
    public int countMatchesWithSmallDifference(int[] nums1, int[] nums2) {
        int count = 0;
        int length = Math.min(nums1.length, nums2.length);
        for (int i = 0; i < length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;

            }
        }
        return count;
    }

}