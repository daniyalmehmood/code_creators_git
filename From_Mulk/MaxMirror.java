//Array-3 > maxMirror
public class MaxMirror {
    public int longestMirroredSubarray(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentIndex = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (i + currentIndex < nums.length && nums[i + currentIndex] == nums[j]) {
                    currentIndex++;
                    if (currentIndex > count) {
                        count = currentIndex;
                    }
                } else {
                    currentIndex = 0;
                }
            }
        }
        return count;
    }
}