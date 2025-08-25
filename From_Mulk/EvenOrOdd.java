//Array-2 > modThree
public class EvenOrOdd {
    public boolean hasThreeConsecutiveEvenOrOdd(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEven++;
                countOdd = 0;
            }
            if (nums[i] % 2 != 0) {
                countOdd++;
                countEven = 0;
            }
            if (countEven == 3 || countOdd == 3) {
                return true;
            }
        }
        return false;
    }
}


