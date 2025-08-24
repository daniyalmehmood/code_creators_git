// Array-2 > no14
public class WithoutFourOne {
    public boolean hasNoOneAndFourTogether(int[] nums) {
        boolean noOne = false;
        boolean noFour = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                noOne = true;
            if (nums[i] == 4)
                noFour = true;
        }
        return (!(noOne && noFour));
    }
}