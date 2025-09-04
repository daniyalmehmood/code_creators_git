//AP-1 > scoresSpecial
public class UniqueScore {
    public int getMaxSpecialScoreSum(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] scores) {
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0 && scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }

}