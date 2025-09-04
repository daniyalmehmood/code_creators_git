import java.util.Arrays;

public class EndyNumberExtractor {//AP-1 > copyEndy
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFirstEndyNumbers(new int[]{9, 11, 90, 22, 6}, 2))); // → [9, 90]
        System.out.println(Arrays.toString(getFirstEndyNumbers(new int[]{9, 11, 90, 22, 6}, 3))); // → [9, 90, 6]
        System.out.println(Arrays.toString(getFirstEndyNumbers(new int[]{12, 1, 1, 13, 0, 20}, 2))); // → [1, 1]
    }
    public static int[] getFirstEndyNumbers(int[] nums, int count) {
        int[] result = new int[count];
        int foundCount = 0;
        int currentIndex = 0;
        while (currentIndex < nums.length && foundCount < count) {
            if (isEndyNumber(nums[currentIndex])) {
                result[foundCount++] = nums[currentIndex];
            }
            currentIndex++;
        }
        return result;
    }
    public static boolean isEndyNumber(int n) {
        return n >= 0 && n <= 10 || n >= 90 && n <= 100;
    }
}