import java.util.Arrays;

public class EvenExtractor {//AP-1 > copyEvens
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractFirstEvens(new int[]{3, 2, 4, 5, 8}, 2))); // → [2, 4]
        System.out.println(Arrays.toString(extractFirstEvens(new int[]{3, 2, 4, 5, 8}, 3))); // → [2, 4, 8]
        System.out.println(Arrays.toString(extractFirstEvens(new int[]{6, 1, 2, 4, 5, 8}, 3))); // → [6, 2, 4]
    }
    public static int[] extractFirstEvens(int[] nums, int count) {
        int[] evenNumbersList = new int[count];
        int index = 0;
        int i = 0;
        while (i < nums.length && index < count) {
            if (nums[i] % 2 == 0) {
                evenNumbersList[index++] = nums[i];
            }
            i++;
        }
        return evenNumbersList;
    }
}