import java.util.Arrays;
public class ZeroFrontArranger {
    public static int[] moveZerosToFront(int[] nums) {
        int[] result = new int[nums.length]; // initialize new array
        int zeroIndex = 0;
        int notZeroIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) { //find 0 and add it at the beginning of the result array
            if (nums[i] == 0) {
                result[zeroIndex] = 0;
                zeroIndex++;

            }
            else { // add not 0 index at the end of result array
                result[notZeroIndex] = nums[i];
                notZeroIndex--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = moveZerosToFront(new int[]{1, 0, 0, 1});
        System.out.println(Arrays.toString(result));
    }
}
