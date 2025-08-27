public class NumbersBeforeFour {
    public int[]getNumbersBeforeFour(int[]nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                count++;
            } else {
                break;
            }
        }

        int[]newArray = new int[count];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = nums[j];
        }
        return newArray;
    }
}