public class CenteredAverageCalculator {
    public static int calculateCenteredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i]; // sum all the values
            if (nums[i] < min) { // check if the value is minimum value in the array
                min = nums[i]; // update min
            }
            if (nums[i] > max) { //  check if the value is minimum value in the array
                max = nums[i]; // update min
            }
        }
        sum = sum - min - max; // subtract the max and min value from the total sum
        return sum / (nums.length - 2); // the average of centred value
    }
    public static void main(String[] args) {
        System.out.println(calculateCenteredAverage(new int[]{1, 2, 3, 4, 100}));
    }
}
