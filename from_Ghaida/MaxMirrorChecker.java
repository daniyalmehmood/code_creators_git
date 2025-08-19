public class MaxMirrorChecker {//Array-3 > maxMirror
    public static void main(String[] args) {
        System.out.println(findMaxMirror(new int[]{1, 2, 3, 2, 1})); // → 3
        System.out.println(findMaxMirror(new int[]{1, 2, 1, 4})); // → 3
        System.out.println(findMaxMirror(new int[]{7, 1, 2, 9, 7, 2, 1})); // → 2
    }
    public static int findMaxMirror(int[] nums) {
        int maxMirrorLength = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int leftPointer = i;
                    int rightPointer = j;
                    while (leftPointer < nums.length && rightPointer >= i && nums[leftPointer] == nums[rightPointer]) {
                        leftPointer++;
                        rightPointer--;
                    }
                    maxMirrorLength = Math.max(maxMirrorLength, j - rightPointer);
                }

            }
        }
        return maxMirrorLength;
    }
}