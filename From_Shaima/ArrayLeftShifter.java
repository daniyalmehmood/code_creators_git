import java.util.Arrays;
public class ArrayLeftShifter {
    public static int[] rotateLeft(int[] nums) {
        if (nums.length==0){return nums;}
        int firstElement = nums[0]; // initialize a variable to hold the first element in the array
        for (int i=0 ; i< nums.length -1 ; i++){ // use for loop
            nums[i]=nums[i+1]; // shift the left element to right
        }
        nums[nums.length-1]=firstElement; // make last element in the array to be the first before the loop
        return nums;
    }
    public static void main(String[] args) {
        int[] result = rotateLeft(new int[]{6, 2, 5, 3});
        System.out.println(Arrays.toString(result));
    }
}
