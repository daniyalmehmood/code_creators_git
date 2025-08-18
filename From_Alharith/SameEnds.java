public class SameEnds {

    public boolean startsAndEndsMatch(int[] nums, int len) {

        for (int i=0; i<len; i++){

            if (nums[i]!=nums[i+nums.length-len]) return false;

        }
        return true;
    }

}
