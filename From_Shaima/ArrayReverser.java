import java.util.Arrays;
public class ArrayReverser {
    public static int[] reverseThreeElements(int[] nums) {
        return new int[]{nums[2],nums[1],nums[0]};//return a new array that reverse the order of elements from original array "Note the array length is 3"
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(reverseThreeElements(new int[]{1, 2, 3})));
    }
}
