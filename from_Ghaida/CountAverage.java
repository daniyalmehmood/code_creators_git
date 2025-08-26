public class CountAverage {//Array-2 > centeredAverage
    public static void main(String[] args) {
        System.out.println(excludeMinMaxAverage(new int[] {1, 2, 3, 4, 100}));// → 3
        System.out.println(excludeMinMaxAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));// → 5
        System.out.println(excludeMinMaxAverage(new int[]{-10, -4, -2, -4, -2, 0}));// → -3
    }
    public static int excludeMinMaxAverage(int[] nums) {
        int sumValues = 0;
        int largestValue = nums[0];
        int smallestValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sumValues += nums[i];
            if(nums[i] > largestValue){
                largestValue = nums[i];
            }
            if(nums[i] < smallestValue){
                smallestValue = nums[i];
            }
        }
        return (sumValues - largestValue - smallestValue) / (nums.length - 2);//return average
    }
}