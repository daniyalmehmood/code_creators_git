//AP-1 > scoresAverage

public class MaxHalfAverage {
    public int maxHalfAverageCalculator(int[]scores) {
        int midIndex = scores.length / 2;
        int firstHalf = average(scores, 0, midIndex - 1);
        int secondHalf = average(scores, midIndex, scores.length - 1);

        return Math.max(firstHalf, secondHalf);

    }
    public int average(int[]scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

}