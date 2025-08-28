public class ClumpSumSolver {

    public static boolean canReachTargetWithClumps(int startIndex, int[] numbers, int target) {
        //  if we reached the end of the array
        if (startIndex >= numbers.length) {
            return target == 0;
        }

        int clumpSum = 0;
        int nextIndex;
        for (nextIndex = startIndex; nextIndex < numbers.length; nextIndex++) {
            if (numbers[nextIndex] == numbers[startIndex]) {
                clumpSum += numbers[nextIndex];
            } else {
                break;
            }
        }

        return canReachTargetWithClumps(nextIndex, numbers, target - clumpSum) || canReachTargetWithClumps(nextIndex, numbers, target);
    }

    public static void main(String[] args) {
        System.out.println(canReachTargetWithClumps(0, new int[]{2, 4, 8}, 10));
        System.out.println(canReachTargetWithClumps(0, new int[]{1, 2, 4, 8, 1}, 14));
        System.out.println(canReachTargetWithClumps(0, new int[]{2, 4, 4, 8}, 14));
    }
}