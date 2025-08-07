public class ArrayTwoThreeChecker {
    public static boolean hasTwoOrThree(int[] nums) {
        if (nums[0]==2 || nums[0]==3 || nums[1]==2 || nums[1]==3){ //check the arrays elements is it 2 or 3 "Note the array length is 2" 
            return true; // there is 2 or 3 in the array 
        }
        return false; // no 2 or 3 in the array 
    }
    public static void main(String[] args) {
        System.out.println(hasTwoOrThree(new int[]{2, 5}));
        System.out.println(hasTwoOrThree(new int[]{1, 3}));
        System.out.println(hasTwoOrThree(new int[]{4, 5}));
    }
}
