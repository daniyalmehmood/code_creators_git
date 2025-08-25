// Array-3 > maxMirror
public class MaxMirrorFinder {
    public int grtMaxMirrorLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int mirrorLength = 0;
                int forwardIndex = i;
                int backwardIndex = j;
                while (forwardIndex < nums.length && backwardIndex >= 0 && nums[forwardIndex] == nums[backwardIndex]) {
                    forwardIndex++;
                    backwardIndex--;
                    mirrorLength++;
                }
                if (mirrorLength > max) {
                    max = mirrorLength;
                }
            }
        }
        return max;
    }

}
