// Array-2 > centeredAverage
public class CenteredAverage {
    public static int calculateCenteredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += num;
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        sum = sum - max - min;
        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(calculateCenteredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(calculateCenteredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(calculateCenteredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}
