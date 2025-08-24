import java.util.Arrays;

public class ZeroFillWithLast {
    public static int[] keepLast(int[] nums) {
        int end = nums[nums.length - 1];
        int[] newLen = new int[nums.length * 2];
        newLen[newLen.length - 1] = end;
        return newLen;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(keepLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(keepLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(keepLast(new int[]{3})));
        System.out.println(Arrays.toString(keepLast(new int[]{0})));
        System.out.println(Arrays.toString(keepLast(new int[]{1, 2, 3, 4})));

    }
}
