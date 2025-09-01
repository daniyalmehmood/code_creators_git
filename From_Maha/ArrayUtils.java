//Array-2 > zeroFront
public class ArrayUtils {
    public int[] zeroFront(int[] nums) {
        int[] newArray = new int[nums.length]; // new array to store result
        int zeroIndex = 0;                     // index to place zeros
        // First pass: place all zeros at the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArray[zeroIndex] = 0;
                zeroIndex++;
            }
        }
        // Second pass: place all non-zero numbers in the remaining positions
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[zeroIndex] = nums[i];
                zeroIndex++;
            }
        }
        return newArray;
    }
}
