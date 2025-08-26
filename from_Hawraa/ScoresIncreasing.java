// AP-1 > scoresIncreasing
public class ScoresIncreasing {
    public boolean isScoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }
}