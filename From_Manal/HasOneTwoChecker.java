//Array-2 > has12

public class HasOneTwoChecker {

    public static boolean has12(int[] nums) {
        boolean foundOne = false; // To track if we have seen a 1

        for (int num : nums) {
            if (num == 1) {
                foundOne = true; // Mark that we found 1
            }
            if (foundOne && num == 2) {
                return true; // Found 2 after 1
            }
        }

        return false; // No 2 found after 1
    }

    // Test the method
    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 2}));         
        System.out.println(has12(new int[]{3, 1, 2}));        
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));  
        System.out.println(has12(new int[]{3, 4, 5, 2}));     
        System.out.println(has12(new int[]{1, 3, 4, 5}));    
    }
}