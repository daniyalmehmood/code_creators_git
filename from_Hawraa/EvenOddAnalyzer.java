// Array-2 > modThree
public class EvenOddAnalyzer {
    public static boolean hasTripleEvenOrOdd(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 1, 3, 5}));
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 1, 2, 5}));
        System.out.println(hasTripleEvenOrOdd(new int[]{2, 4, 2, 5}));
    }
}
