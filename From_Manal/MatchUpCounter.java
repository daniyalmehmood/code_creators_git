public class MatchUpCounter {
    // Method to count how many pairs have a difference of 2 or less but are not equal
    public static int countCloseButNotEqual(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);

            // Check if the numbers are close (difference <= 2) and not equal
            if (difference <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(countCloseButNotEqual(
                new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}