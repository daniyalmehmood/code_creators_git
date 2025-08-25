public class ChocolateBarPacker {
    // Calculates the number of small bars needed to meet the goal weight using big bars first.
    // Returns -1 if it's not possible to meet the goal with the available bars.
    public int calculateSmallBarsRequired(int smallBars, int bigBars, int goalWeight) {
        int bigUsed = Math.min(bigBars, goalWeight / 5);
        int smallUsed = goalWeight - bigUsed * 5;

        if (smallUsed <= smallBars) {
            return smallUsed;
        }
        return -1;
    }
}

   