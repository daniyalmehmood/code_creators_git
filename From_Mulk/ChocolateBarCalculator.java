public class ChocolateBarCalculator {
    public int maxBigBarsUsable(int small, int big, int goal) {
        int newSmall = small;
        int newBig = 5 * big;
        int bigAllowed = Math.min(big, goal / 5);
        int bigWeight = bigAllowed * 5;
        int result = goal - bigWeight;
        if (result <= newSmall) {
            return result;
        } else {
            return -1;
        }
    }
}



