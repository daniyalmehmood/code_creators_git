// AP-1 > copyEndy
public class SpecialNumberArray {
    public int[] getEndyNumbers(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEndy(nums[i])) {
                result[index] = nums[i];
                index++;
            }
            if (index == count) {
                break;
            }
        }
        return result;
    }

    public boolean isEndy(int n) {
        if (0 <= n && n <= 10) {
            return true;
        }
        if (90 <= n && n <= 100) {
            return true;
        }
        return false;
    }
}
