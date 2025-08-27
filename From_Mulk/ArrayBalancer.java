//Array-3 > canBalance
public class ArrayBalancer {
    public boolean canSplitArrayWithEqualSum(int[] nums) {
        for (int split = 0; split < nums.length; split++) {
            int countFirst = 0;
            int countSecond = 0;

            int[] firstPart = new int[split];
            for (int i = 0; i < firstPart.length; i++) {
                countFirst += nums[i];
            }

            int[] secondPart = new int[nums.length - split];
            for (int i = 0; i < secondPart.length; i++) {
                countSecond += nums[split + i];
            }

            if (countFirst == countSecond) {
                return true;
            }
        }
        return false;
    }
}