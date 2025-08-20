//Array-2 > evenOdd
public class EvenOddSeparator {
    public static int[] separateEvenAndOdd(int[] nums) {
        int indxEven = 0;
        int indxOdd = 0;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //place all evens in order
            if (nums[i] % 2 == 0) {
                newArray[indxEven] = nums[i];
                indxEven++;
            }
        }
        // place all odds in order
        indxOdd = indxEven;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                newArray[indxOdd] = nums[i];
                indxOdd++;
            }
        }
        return newArray;
    }

}
