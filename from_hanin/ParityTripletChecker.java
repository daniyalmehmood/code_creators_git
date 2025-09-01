//Array-2 > modThree
public class ParityTripletChecker {
    public static boolean hasThreeConsecutiveEvenOrOdd(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            // num % 2 == 0  // even
//num % 2 != 0  // odd
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

}
