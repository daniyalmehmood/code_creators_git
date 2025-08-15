public class FirstThreeSumCalculator {
    public static int calculateSumOfFirstThreeElements(int[] nums) {
        return nums[0]+nums[1]+nums[2]; // return the sum of the first three elements in the array "Note the array length is 3"
    }
    public static void main(String[] args) {
        System.out.println(calculateSumOfFirstThreeElements(new int[]{1,2,3}));
    }
}
