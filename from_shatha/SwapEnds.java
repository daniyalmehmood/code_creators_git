import java.util.Arrays;

public class SwapEnds {
    public static int[] SwapFirstAndLastElements(int[] nums) {

        int[] result = Arrays.copyOf(nums, nums.length);

        if (result.length > 1) {
            int temp = result[0];
            result[0] = result[result.length - 1];
            result[result.length - 1] = temp;
        }

        return result;
    }
        public static void main(String[] args){
            System.out.println(Arrays.toString(SwapFirstAndLastElements(new int[] {1,2,3,4})));
            System.out.println(Arrays.toString(SwapFirstAndLastElements(new int[] {1,2,3})));
            System.out.println(Arrays.toString(SwapFirstAndLastElements(new int[] {8,6,7,9,5})));

        }
    }