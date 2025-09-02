public class EveryTwoHasNeighborTwo {
    public static boolean hasOnlyPairedTwos(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {

                if (i == 0 || nums[i - 1] != 2) {
                    if (i == nums.length - 1 || nums[i + 1] != 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasOnlyPairedTwos(new int[]{4, 2, 2, 3}));
        System.out.println(hasOnlyPairedTwos(new int[]{2, 2, 4}));
        System.out.println(hasOnlyPairedTwos(new int[]{2, 2, 4, 2}));
    }
}
