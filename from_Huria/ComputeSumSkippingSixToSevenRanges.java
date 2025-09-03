public class ComputeSumSkippingSixToSevenRanges {
    public static int computeSumSkippingSixToSevenRanges(int[] nums) {
        int sumBeforSix = 0;
        int lastValueOfArray = 0;
        int sumAfterSix = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 7 && lastValueOfArray == 6) {
                lastValueOfArray = 7;
            } else if (lastValueOfArray == 6 || nums[i] == 6) {
                sumAfterSix += nums[i];
                lastValueOfArray = 6;
            } else {
                sumBeforSix += nums[i];
            }

        }
        return sumBeforSix;
    }

    public static void main(String[] args) {
        System.out.println(computeSumSkippingSixToSevenRanges(new int[]{1, 2, 2}));
        System.out.println(computeSumSkippingSixToSevenRanges(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(computeSumSkippingSixToSevenRanges(new int[]{1, 1, 6, 7, 2}));
    }
}
