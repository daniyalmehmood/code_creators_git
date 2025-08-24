// Array-2 > haveThree
public class ThreeCountAnalyzer {
    public static boolean hasThreeSeparatedThrees(int[] nums) {
        int countThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                countThree++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }
        return countThree == 3;
    }

    public static void main(String[] args) {
        System.out.println(hasThreeSeparatedThrees(new int[]{3, 1, 3, 1, 3}));
        System.out.println(hasThreeSeparatedThrees(new int[]{3, 1, 3, 3}));
        System.out.println(hasThreeSeparatedThrees(new int[]{3, 4, 3, 3, 4}));
    }
}
