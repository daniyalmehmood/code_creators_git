public class ArrayMatchCounter {
    public static int almostMatches(int[] nums1, int[] nums2) {
        int count=0;
        for (int i=0 ; i<nums1.length ; i++){
            if (nums1[i]!=nums2[i]){
                if (Math.abs(nums1[i]-nums2[i])<=2) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(almostMatches(new int[]{1, 2, 3},new int[]{2,3, 10}));
    }
}
