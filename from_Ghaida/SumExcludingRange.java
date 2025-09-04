public class SumExcludingRange {//Array-2 > sum67
    public static void main(String[] args) {
        System.out.println(calculateSumExcludingRange(new int[]{1, 2, 2}));// → 5
        System.out.println(calculateSumExcludingRange(new int[]{1, 2, 2, 6, 99, 99, 7}));// → 5
        System.out.println(calculateSumExcludingRange(new int[]{1, 1, 6, 7, 2}));// → 4
    }
    public static int calculateSumExcludingRange(int[] nums) {
        int sum = 0;
        boolean skipNumber = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 6){
                skipNumber = true;//start skipping
            }
            if(skipNumber){
                if(nums[i] == 7){
                    skipNumber = false;//stop skipping
                }
                continue;
            }
            sum+= nums[i];
        }
        return sum;
    }
}