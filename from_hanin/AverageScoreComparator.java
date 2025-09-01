public class AverageScoreComparator {
    public int getHigherHalfAverage(int[] scores) {
        int mid = scores.length / 2;
        int firstHalfAvg = average(scores, 0, mid - 1);
        int secondHalfAvg = average(scores, mid, scores.length - 1);
        return Math.max(firstHalfAvg, secondHalfAvg);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);  //  to get the average
    }

}
