public class MirrorSectionFinder {
    public int getMaxMirrorLength(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = nums.length - 1; i + count < nums.length && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {

                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);

        }
        return max;

    }

}
