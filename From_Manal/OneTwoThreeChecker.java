
public class OneTwoThreeChecker {
    public static boolean hasSequenceOneTwoThree(int[] nums) {

        for (int i =0; i< (nums.length-2); i++){
            if (nums[i]==1 && nums[i+1]==2 && nums [i+2]==3)
                return true; }


        return false;
    }
    public static void main(String[] arg) {
        System.out.println(hasSequenceOneTwoThree(new int[]{1, 1, 2, 3, 1}));
        System.out.println(hasSequenceOneTwoThree(new int[]{1, 1, 2, 4, 1}));
        System.out.println(hasSequenceOneTwoThree(new int[]{1, 1, 2, 1, 2, 3}));
    }
}
