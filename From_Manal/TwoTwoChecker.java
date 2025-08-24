//Array-2 > twoTwo

public class TwoTwoChecker {

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Check if the 2 is part of a pair
                boolean hasLeftTwo = (i > 0 && nums[i - 1] == 2);
                boolean hasRightTwo = (i < nums.length - 1 && nums[i + 1] == 2);

                if (!hasLeftTwo && !hasRightTwo) {
                    return false; // 2 is alone
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));      
        System.out.println(twoTwo(new int[]{2, 2, 4}));        
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));     
        System.out.println(twoTwo(new int[]{2, 3, 2, 2}));      
        System.out.println(twoTwo(new int[]{1, 3, 4}));        
    }
}