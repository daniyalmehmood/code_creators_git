public class ZeroMax {

    public int[] replaceZeroWithMaxOdd(int[] nums) {

        for (int i=0; i<nums.length;i++){
            int maxOdd=0;

            if (i<nums.length-1 && nums[i]==0){
                for(int j=i+1; j<nums.length; j++){
                    if (nums[j]%2 !=0 && nums[j]>maxOdd ) {
                        maxOdd=nums[j];
                    }
                }
                nums[i]=maxOdd;
            }
        }
        return nums;
    }

}
