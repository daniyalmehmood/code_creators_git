import java.util.Arrays;

public class FirstAndLastElementsExtractor {
    public static int[] getFirstAndLastElements(int[] nums) {
        int last = nums.length - 1;
        return new int[]{nums[0], nums[last]};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFirstAndLastElements(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(getFirstAndLastElements(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(getFirstAndLastElements(new int[]{7, 4, 6, 2})));
    }
    }
