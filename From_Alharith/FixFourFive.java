public class FixFourFive {

    public int[] pairFourWithFive (int[] nums) {
        for (int i=0; i<nums.length;i++){

            if (nums[i]== 4){
                for (int j=0; j<nums.length;j++){

                    int swap=nums[i+1];
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        nums[i+1]=nums[j];
                        nums[j]=swap;
                    }
                }
            }
        }
        return nums;
    }

}
