import java.util.Arrays;

public class RotateLeftThree {
    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1,2,3})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{5,11,9})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{7,0,0})));
    }
}
