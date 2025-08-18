public class HaveThree {

    public boolean hasThreeSpacedThrees(int[] nums) {
        int count=0;
        boolean appears=false;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==3) count++;

            if (i<nums.length-4 && nums[i]==3 && nums[i+2]==3 && nums[i+4]==3) {
                appears=true;
            }
        }
        return appears && count==3;
    }

}
