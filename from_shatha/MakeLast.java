import java.util.Arrays;
public class MakeLast {
    public static int[] makeLast(int[] nums) {
       int[] last = new int[nums.length*2];
        last[last.length-1]= nums[nums.length-1];
       return last;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
    }
}

