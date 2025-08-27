// AP-1 > scoresSpecial
public class SpecialScoreCalculator {
    public int sumLargestScores(int[] a, int[] b) {
        return maxScores(a) + maxScores(b);
    }

    public int maxScores(int[] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            int score = n[i];
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }
}