// Array-2 > matchUp
public class NearMatchCounter {
    public static int countNearMatches(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff <= 2 && diff != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}
