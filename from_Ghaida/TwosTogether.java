public class TwosTogether {//Array-2 > twoTwo
    public static void main(String[] args) {
        System.out.println(allTwosPaired(new int[]{4, 2, 2, 3}));// → true
        System.out.println(allTwosPaired(new int[]{2, 2, 4}));// → true
        System.out.println(allTwosPaired(new int[]{2, 2, 4, 2}));// → false
    }
    public static boolean allTwosPaired(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if(i < nums.length -2 && nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
                    return true;
                }
                // Check if the current 2 is part of a pair
                if (i < nums.length - 1 && nums[i + 1] == 2) {
                    // Skip the next index since we found a pair
                    i++;
                } else {
                    // If we find a single 2, return false
                    return false;
                }
            }
        }
        return true;
    }
}