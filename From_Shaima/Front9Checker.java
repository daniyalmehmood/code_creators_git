public class Front9Checker {
    public static boolean contain9InFront(int[] nums) {
        int numsLength = nums.length; // initialize  'numsLength' variable and the length of the array 'nums[]'
        if (numsLength>4) // check the length of the array if greater than 4
        {
            numsLength = 4; // make the length of array to be 4
        }
        for (int i=0; i<numsLength ; i++) // use a  for loop to go through the first 4 elements only
        {
            if (nums[i]==9) // if one of the 4 element is 9
            {
                return true; // return true
            }
        }
        return false; // otherwise return false
    }
    public static void main(String[] args) {
        System.out.println(contain9InFront(new int[]{1, 2, 9, 3, 4}));
        System.out.println(contain9InFront(new int[]{1, 2, 3, 4, 9}));
        System.out.println(contain9InFront(new int[]{1, 2, 3, 4, 5}));
        System.out.println(contain9InFront(new int[]{9, 2, 3}));
        System.out.println(contain9InFront(new int[]{1, 9, 9}));
        System.out.println(contain9InFront(new int[]{1, 2, 3}));
        System.out.println(contain9InFront(new int[]{1, 2}));
        System.out.println(contain9InFront(new int[]{}));
        System.out.println(contain9InFront(new int[]{1}));
    }
}
