// AP-1 > copyEvens
public class EvenNumberArray {
    public int[] selectFirstEvensNumber(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
            if (index == count) {
                break;
            }
        }
        return result;
    }
}