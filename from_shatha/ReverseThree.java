import java.util.Arrays;
public class ReverseThree {
    public static int[] reversthree(int[] nums) {
        return new int[]{ nums[2],nums[1], nums[0]};

    }

public static void main(String[] args){
    System.out.println(Arrays.toString(reversthree(new int[]{1,2,3})));
    System.out.println(Arrays.toString(reversthree(new int[]{5,11,9})));
    System.out.println(Arrays.toString(reversthree(new int[]{7,0,0})));
}
}