public class EitherTwoFour {

    public boolean eitherConsecutiveTwosOrFours(int[] nums) {

        boolean has2= false;
        boolean has4= false;

        for(int i=0; i<nums.length-1; i++){

            if (nums[i] ==2 && nums[i+1]==2) has2=true;
            if (nums[i] ==4 && nums[i+1]==4) has4=true;
        }
        if (has2 && has4) return false;
        return has2||has4;
    }
}
