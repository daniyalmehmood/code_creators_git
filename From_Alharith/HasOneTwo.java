public class HasOneTwo {

    public boolean hasOneFollowedByTwo(int[] nums) {
        boolean has1=false;
        boolean has2=false;

        for (int i=0; i<nums.length; i++){

            if (nums[i]==1) has1=true;
            if (has1 && nums[i]==2) has2=true;
        }
        return (has1 && has2 );
    }

}
