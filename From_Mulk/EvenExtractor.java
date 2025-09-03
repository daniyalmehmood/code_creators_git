//AP-1 > copyEvens
public class EvenExtractor {
    public int[] copyFirstNEvensFromArray(int[] nums, int count) {
        int newIndex = 0;
        int[] newArray = new int[count];
        for (int i = 0; i < nums.length && newIndex < count; i++) {
            if (nums[i] % 2 == 0) {
                newArray[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newArray;
    }

}