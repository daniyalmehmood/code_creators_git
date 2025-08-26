public class CanBalance {

    public boolean isArrayBalanced(int[] nums) {

        int sumLast=0;
        int sumFirst=0;
        for (int i=nums.length-1;i>=0;i--){
            for (int j=0; j<i; j++ ){
                sumFirst+=nums[j];
            }
            sumLast+=nums[i];

            if (sumFirst==sumLast) return true;
            else sumFirst=0;

        }
        return false;

    }

}
