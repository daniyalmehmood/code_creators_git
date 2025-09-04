public class SixFollowChecker {
    public static void main(String[] args) {
        System.out.println(countSixPairs(new int[] {6, 6, 2})); //1
        System.out.println(countSixPairs(new int[] {6, 6, 2, 6})); //1
        System.out.println(countSixPairs(new int[] {6, 7, 2, 6})); //1
    }
    public static int countSixPairs(int[] nums) {
        int count6 = 0;
        for (int i= 0; i < nums.length - 1; i++){
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count6++;
            }
        }
        return count6;
    }
}
