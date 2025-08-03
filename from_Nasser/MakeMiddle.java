public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {

        if(nums.length==2) return nums;
        if(nums.length%2==0){

            int middle=nums.length/2;
            return new int[]{nums[nums.length/2-1],nums[nums.length/2]};
        }
        else return nums;
    }

}
