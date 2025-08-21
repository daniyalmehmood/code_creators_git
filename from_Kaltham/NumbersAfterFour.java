public class NumbersAfterFour {
    public int[]getNumbersAfterLastFour(int[]nums) {
        int lastFour = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFour = i;
            }
        }
        int count = nums.length - lastFour - 1;
        int[]newArray = new int[count];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = nums[lastFour + 1 + j];

        }

        return newArray;
    }
}