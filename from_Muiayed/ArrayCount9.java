public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9};
        System.out.println(arrayCount9(nums));
    }
}
