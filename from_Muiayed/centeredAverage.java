public class centeredAverage {
    public static int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
            sum += n;
        }
        return (sum - min - max) / (nums.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}