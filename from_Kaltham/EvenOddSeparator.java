public class EvenOddSeparator {
    public int[]separateEvenAndOdd(int[]nums) {
        int[]newArray = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArray[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                newArray[count] = nums[i];
                count++;
            }
        }
        return newArray;
    }
}