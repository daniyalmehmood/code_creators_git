public class MatchUp {
    public static int matchUp(int[] nums1, int[] nums2) {
        int c = 0;
        for (int i = 0; i < nums1.length; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            if (d <= 2 && d != 0) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}