public class ArrayPatternChecker {
    public static boolean check271Pattern(int[] nums) {
        for (int i=0 ; i<nums.length-2 ; i++) //Use a for-loop to go through each element in the array 'nums[]' unless the last 2 elements
        {
            if ((nums[i + 1] == (nums[i] + 5)) &&  //check in the array ,if a value followed by the value plus 5
                    (nums[i + 2] >= nums[i] - 3) && // then followed by the value less than or equal +1 and greater than or equal -3
                    (nums[i + 2] <= nums[i] + 1))
            {
                return true; // return true if the condition true
            }
        }
        return false; //otherwise return false
    }
    public static void main(String[] args){
        System.out.println(check271Pattern(new int[]{1, 2, 7, 1}));
        System.out.println(check271Pattern(new int[]{1, 2, 8, 1}));
        System.out.println(check271Pattern(new int[]{2, 7, 1}));
    }
}
