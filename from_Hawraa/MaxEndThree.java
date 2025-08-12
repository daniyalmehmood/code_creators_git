import java.util.Arrays;
public class MaxEndThree {
    public static int[] maxEdgeValue(int[] nums) {
        int[] maxEnd = new int[3];
        int firstElemen = nums[0];
        int lastElemen = nums[2];
        int max;
        if (firstElemen >= lastElemen) {
            max = firstElemen;
        }
        else {
            max = lastElemen;
        }
        maxEnd[0] = max;
        maxEnd[1] = max;
        maxEnd[2] = max;

        return maxEnd;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEdgeValue(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEdgeValue(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEdgeValue(new int[]{2, 11, 3})));

    }
}
