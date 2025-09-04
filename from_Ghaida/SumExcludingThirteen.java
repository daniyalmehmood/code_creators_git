public class SumExcludingThirteen {//Array-2 > sum13
    public static void main(String[] args) {
        System.out.println(calculateSumExcludingThirteen(new int[]{1, 2, 2, 1}));// → 6
        System.out.println(calculateSumExcludingThirteen(new int[]{1, 1}));// → 2
        System.out.println(calculateSumExcludingThirteen(new int[]{1, 2, 2, 1, 13}));// → 6
    }
    public static int calculateSumExcludingThirteen(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 13){
                i++;//skip the next element
                continue;
            }
            sum += nums[i];//add non-skipped numbers
        }
        return sum;
    }
}