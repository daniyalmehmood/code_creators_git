import java.util.Arrays;
public class ArrayRotator {
    public static int[] rotateLeftThreeElement(int[] nums) {
            return new int[]{nums[1], nums[2], nums[0]}; //return a new array that rotate the first element to be in the index 2 "Note the array length is 3"
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(rotateLeftThreeElement(new int[]{5, 11, 9})));


    }
}
