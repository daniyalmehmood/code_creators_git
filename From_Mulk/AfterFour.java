//Array-2 > post4
public class AfterFour {
    public int[] elementsAfterLastFour(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i + 1;
            }
        }
        int[] newArray = new int[nums.length - index];
        for (int i = 0; i < nums.length - index; i++) {
            newArray[i] = nums[i + index];
        }

        return newArray;
    }
}