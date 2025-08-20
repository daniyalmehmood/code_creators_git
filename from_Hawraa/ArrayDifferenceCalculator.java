// Array-2 > bigDiff
public class ArrayDifferenceCalculator {
    public static int maxMinDifference(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args){
        System.out.println(maxMinDifference(new int[]{10, 3, 5, 6}));
        System.out.println(maxMinDifference(new int[]{7, 2, 10, 9}));
        System.out.println(maxMinDifference(new int[]{2, 10, 7, 2}));
    }
}

