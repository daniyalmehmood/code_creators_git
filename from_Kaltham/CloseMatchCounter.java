public class CloseMatchCounter {
    public int countCloseMatches(int[]nums1, int[]nums2) {
        int closeMatchCount = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                closeMatchCount++;
            }
        }
        return closeMatchCount;
    }
}