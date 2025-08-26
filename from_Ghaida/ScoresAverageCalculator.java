public class ScoresAverageCalculator {//AP-1 > scoresAverage

    public static void main(String[] args) {
        System.out.println(halfScoresAverage(new int[]{2, 2, 4, 4}));// → 4
        System.out.println(halfScoresAverage(new int[]{4, 4, 4, 2, 2, 2}));// → 4
        System.out.println(halfScoresAverage(new int[]{3, 4, 5, 1, 2, 3}));// → 4
    }
    public static int halfScoresAverage(int[] scores) {
        int middleValues = scores.length / 2;
        int averageOfFirstGroup = averageHelper(scores, 0, middleValues -1);
        int averageOfSecondGroup = averageHelper(scores, middleValues, scores.length - 1);
        return Math.max(averageOfFirstGroup, averageOfSecondGroup);
    }
    private static int averageHelper(int[] scores, int start, int end) {
        int sumOfValues = 0;
        for (int i = start; i <= end; i++) {
            sumOfValues += scores[i];
        }
        return sumOfValues / (end - start + 1);
    }
}