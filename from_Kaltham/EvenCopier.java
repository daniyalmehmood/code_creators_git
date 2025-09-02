//AP-1 > copyEvens

public class EvenCopier {
    public int[]copyEvens(int[]nums, int count) {
        int[]newArray = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length && index < count; i++) {
            if (nums[i] % 2 == 0) {
                newArray[index] = nums[i];
                index++;
            }
        }
        return newArray;
    }
}