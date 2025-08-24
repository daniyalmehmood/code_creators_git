//  Array-2 > pre4
public class ArrayBeforeFour {
    public int[] getPreFourElements(int[] nums) {
        int count = 0;
        while (count < nums.length && nums[count] != 4) {
            count++;
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = nums[i];
        }
        return result;
    }
}
