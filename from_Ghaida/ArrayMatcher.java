public class ArrayMatcher {//Array-2 > matchUp
    public static void main(String[] args) {
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 10}));//2
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 5}));//3
        System.out.println(countNearMatches(new int[]{1, 2, 3}, new int[]{2, 3, 3}));//2
    }
    public static int countNearMatches(int[] nums1, int[] nums2) {
        int countMatches = 0;
        for (int i = 0; i < nums1.length && i < nums2.length; i++) {
            if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2){
                countMatches++;
            }
        }
        return countMatches;
    }
}