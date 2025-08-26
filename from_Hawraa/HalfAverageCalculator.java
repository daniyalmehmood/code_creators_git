// AP-1 > scoresAverage
public class HalfAverageCalculator {
    public int getMaxHalfAverage(int[] scores) {
        int firstHalf = average(scores, 0, scores.length / 2);
        int secondHalf = average(scores, scores.length / 2, scores.length);
        return Math.max(firstHalf, secondHalf);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }
}