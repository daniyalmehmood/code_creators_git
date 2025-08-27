public class MirrorSubarrayFinder {
    public int findLongestMirrorLength(int[]nums) {

        int countReverse = 0;
        int maxLengthReverse = 0;

        for (int i = 0; i < nums.length; i++) {
            countReverse = 0;
            for (int j = nums.length - 1; i + countReverse < nums.length && j >= 0; j--) {

                if (nums[i + countReverse] == nums[j]) {
                    countReverse++;

                } else {
                    if (countReverse > 0) {
                        maxLengthReverse = Math.max(countReverse, maxLengthReverse);
                        j += countReverse;
                        countReverse = 0;
                    }
                }

            }
            maxLengthReverse = Math.max(countReverse, maxLengthReverse);

        }

        return maxLengthReverse;
    }
}