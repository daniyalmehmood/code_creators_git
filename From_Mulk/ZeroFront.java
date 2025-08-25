//Array-2 > zeroFront
public class ZeroFront {
    public int[] bringAllZerosToFront(int[] nums) {
        int[] newArray = new int[nums.length];
        int indexZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArray[indexZero] = 0;
                indexZero++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[indexZero] = nums[i];
                indexZero++;
            }
        }
        return newArray;
    }
}