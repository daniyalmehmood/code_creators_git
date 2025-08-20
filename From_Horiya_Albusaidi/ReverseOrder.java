public class ReverseOrder {
    public int[] reverseArrayElementOrder(int[] nums) {
        int[] reversOrderArray =new int[nums.length];
        reversOrderArray[0]=nums[2];
        reversOrderArray[1]=nums[1];
        reversOrderArray[2]=nums[0];
        return reversOrderArray;
    }

}
