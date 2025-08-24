public class ArrayEndsChecker {
    public static boolean isFirstEqualToLast(int[] nums) {
        if (nums.length>=1){ // check the array is not empty 
            if (nums[0]==nums[nums.length -1]){ //check is the first element in the array equal to last element 
                return true; // return true while the condition accepted 
            }
        }
        return false; // otherwise return false 
    }
    public static void  main (String[] args){
        System.out.println(isFirstEqualToLast(new int[] {1, 2, 3}));
        System.out.println(isFirstEqualToLast(new int[] {1, 2, 1}));
    }
}
