public class HighScoreChecker {
    public boolean hasConsecutiveHundreds(int[] scores) {
        int first = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (first == 100 && scores[i] == 100) {
                return true;
            }
            first = scores[i];
        }
        return false;
    }

}
