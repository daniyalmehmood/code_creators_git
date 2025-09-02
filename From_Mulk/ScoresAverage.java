//AP-1 > scoresAverage
public class ScoresAverage {
    public int maxAverageOfFirstAndSecondHalves(int[] scores) {
        int sumOne = 0;
        int sumTwo = 0;
        int middle = scores.length / 2;

        for (int i = 0; i < middle; i++) {
            sumOne += scores[i];
        }

        for (int i = middle; i < scores.length; i++) {
            sumTwo += scores[i];
        }

        int firstAverage = sumOne / middle;
        int secondAverage = sumTwo / (scores.length - middle);

        return Math.max(firstAverage, secondAverage);
    }
}