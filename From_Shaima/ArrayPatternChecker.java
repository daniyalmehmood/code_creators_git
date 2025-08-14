public class ArrayPatternChecker {
    public static boolean contains123(int[] nums) {
        if (nums.length > 2) // check the length of array is greater than 2
        {
            for (int i = 0; i < nums.length - 2; i++)  // using a for loop to go through each element in the array unless the last 2 elements
            {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) //check in the array if contains 1 followed by 2 followed by 3
                {
                    return true; //return true the condition is accepted
                }
            }
        }
        return false;  //return false the condition is not  accepted
    }
    public static void main(String[] args) {
        System.out.println(contains123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(contains123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(contains123(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(contains123(new int[]{1, 1, 2, 1, 2, 1}));
        System.out.println(contains123(new int[]{1, 2, 3, 1, 2, 3}));
        System.out.println(contains123(new int[]{1, 2, 3}));
        System.out.println(contains123(new int[]{1, 1, 1}));
        System.out.println(contains123(new int[]{1, 2}));
        System.out.println(contains123(new int[]{1}));
        System.out.println(contains123(new int[]{}));
    }
}



