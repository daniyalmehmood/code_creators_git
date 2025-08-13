public class BlackjackHelper {
    public static int bestBlackjackScore(int a, int b) {
        //return whichever value is nearest to 21 without going over. Return 0 if they both go over
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
