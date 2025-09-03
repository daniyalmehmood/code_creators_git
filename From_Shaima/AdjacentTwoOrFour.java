public class AdjacentTwoOrFour {
    public static boolean hasEitherDoubleTwoOrDoubleFour(int[] nums) {
        int count22=0; // to count double 2
        int count44=0; // counting double 4
        for (int i=0 ; i<nums.length-1 ; i++){ // go through the array to check double 2 and double 4
            if (nums[i]==2 && nums[i+1]==2) count22++;
            if (nums[i]==4 && nums[i+1]==4) count44++;
        }
        return ((count22==0 && count44>0) || (count44==0 && count22>0)); // return true if there is double 2 and no double 4 Or there is double 4 and no double 2
    }
    public static void main(String[] args) {
        System.out.println(hasEitherDoubleTwoOrDoubleFour(new int[]{4, 4, 1, 2, 2}));
    }
}
