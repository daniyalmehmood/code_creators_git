public class MinMaxDifference {
    public static int calculateRange(int[] nums) {
        int max=nums[0]; // make the first element is the maximum value in the array
        int min=nums[0]; // make the first element is the minimum  value in the array
        for (int i=0 ; i<nums.length ; i++){ // go to through the array
            if (nums[i]>max) max=nums[i]; // update the max value
            if (nums[i]<min) min=nums[i]; // update the min value
        }
        return max-min; // the diff between max and min
    }
    public static void main(String[] args) {
        System.out.println(calculateRange(new int[]{10, 3, 5, 6}));
    }
}
