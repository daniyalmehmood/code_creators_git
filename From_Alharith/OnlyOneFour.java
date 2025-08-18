public class OnlyOneFour {

    public boolean checkOnlyOnesAndFours(int[] nums) {

        for (int i=0; i<nums.length; i++){

            if (nums[i]!= 1 && nums[i] != 4) return false;
        }
        return true;
    }
}
