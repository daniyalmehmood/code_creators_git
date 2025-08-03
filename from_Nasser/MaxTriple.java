public class MaxTriple {

    public int maxTriple(int[] nums) {

        int first=nums[0];
        int middle=nums[nums.length/2];
        int last=nums[nums.length-1];

        return Math.max(first,Math.max(middle,last));

    }

}
