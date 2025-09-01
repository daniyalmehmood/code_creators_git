public class ScoreChecker {
    public boolean checkIncreasingOrder(int[] scores) {
        int first = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (first > scores[i]) {
                return false;
            }
            first = scores[i];
        }
        return true;
    }

}
