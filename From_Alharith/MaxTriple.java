public class MaxTriple {

    public int maxTriple(int[] nums) {
        int mid = (nums.length/2);
        int max = Math.max(nums[0], Math.max(nums[mid], nums[nums.length-1]));

        return max;

    }

}
