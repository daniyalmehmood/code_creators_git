public class MaximumOfThree  {

    public int findLargestOfThree(int[] nums) {
        int mid = (nums.length/2);
        int max = Math.max(nums[0], Math.max(nums[mid], nums[nums.length-1]));

        return max;

    }

}
