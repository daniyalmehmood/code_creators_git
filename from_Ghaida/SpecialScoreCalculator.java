public class SpecialScoreCalculator {//AP-1 > scoresSpecial
    public static void main(String[] args) {
        System.out.println(getCombinedSpecialScores(new int[]{12, 10, 4}, new int[]{2, 20, 30})); // → 40
        System.out.println(getCombinedSpecialScores(new int[]{20, 10, 4}, new int[]{2, 20, 10})); // → 40
        System.out.println(getCombinedSpecialScores(new int[]{12, 11, 4}, new int[]{2, 20, 31})); // → 20
    }
    public static int getCombinedSpecialScores(int[] a, int[] b) {
        return getLargestSpecialScore(a) + getLargestSpecialScore(b);
    }
    public static int getLargestSpecialScore(int[] numbers) {
        int maxSpecialScore  = 0;
        for (int number : numbers) {
            if (number % 10 == 0 && number > maxSpecialScore ) {
                maxSpecialScore  = number;
            }
        }
        return maxSpecialScore;
    }
}