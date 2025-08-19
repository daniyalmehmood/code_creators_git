// Array-2 > more14
public class OneFourChecker {
    public static boolean isOneMoreFour(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOne++;
            }
            if (nums[i] == 4) {
                countFour++;
            }
        }
        return countOne > countFour;
    }

    public static void main(String[] args) {
        System.out.println(isOneMoreFour(new int[]{1, 4, 1}));
        System.out.println(isOneMoreFour(new int[]{1, 4, 1, 4}));
        System.out.println(isOneMoreFour(new int[]{1, 1}));
    }
}
