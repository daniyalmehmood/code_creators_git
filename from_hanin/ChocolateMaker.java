
public class ChocolateMaker {
    public static int calculateSmallBarsNeeded(int small, int big, int goal) {
        int maxBigBars = goal / 5;
        int bigBarsUsed = Math.min(maxBigBars, big);

        int remainder = goal - bigBarsUsed * 5;
// Check if we have enough small bars to reach the goal
        if (remainder <= small) {
            return remainder;
        } else {
            return -1;
        }
    }
}
