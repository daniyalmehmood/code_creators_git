//Array-2 > pre4
public class BeforeFour {
    public int[] getElementsBeforeFour(int[] nums) {
        int count = 0;
        while (count < nums.length && nums[count] != 4) {
            count++;
        }

        int[] newArray = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }
}