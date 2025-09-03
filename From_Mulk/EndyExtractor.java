//AP-1 > copyEndy
public class EndyExtractor {
    public int[] getEndyNumbersFromArray(int[] nums, int count) {
        int newIndex = 0;
        int[] newArray = new int[count];
        for (int i = 0; i < nums.length && newIndex < count; i++) {
            if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
                newArray[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newArray;
    }
}