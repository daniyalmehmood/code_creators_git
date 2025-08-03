public class MidThree {

    public int[] midThree(int[] nums) {

        if (nums.length %2 != 0 && nums.length >= 3){
            int[] partial=new int[3];
            int start=nums.length/2-1;
            for(int i = start;i<start+3;i++){

                partial[i-start]=nums[i];
            }
         return partial;
        }
        else return nums;
    }

}
