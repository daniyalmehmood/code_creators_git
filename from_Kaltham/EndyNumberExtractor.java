//AP-1 > copyEndy

public class EndyNumberExtractor {
    public int[]getFirstNEndyNumbers(int[]nums, int count) {
        int[]newArray = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length && index < count; i++) {
            if (isEndyNumber(nums[i])) {
                newArray[index] = nums[i];
                index++;
            }
        }
        return newArray;
    }

    public boolean isEndyNumber(int n) {
        return (n >= 0 && n <= 10 || n >= 90 && n <= 100);
    }
}