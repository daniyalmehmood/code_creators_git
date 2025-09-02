//AP-1 > scoresIncreasing

public class NonDecreasingChecker {
    public boolean isNonDecreasing(int[]scores) {
        if (scores.length >= 2) {
            for (int i = 0; i < scores.length - 1; i++) {
                if (scores[i] > scores[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}