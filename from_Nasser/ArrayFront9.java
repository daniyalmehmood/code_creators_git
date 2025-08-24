public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {

        int max=Math.min(nums.length, 4);

        for(int i=0;i<max;i++){

            if(nums[i]==9){
                return true;
            }
        }
     return false;}
}