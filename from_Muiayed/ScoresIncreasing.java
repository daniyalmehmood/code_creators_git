public class ScoresIncreasing {

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                // Found a drop → sequence is NOT non-decreasing
                return false;
            }
        }
        return true;  // never found a drop
    }

    public static void main(String[] args) {
        int[][] tests = {
                {1, 3, 4},
                {1, 3, 2},
                {1, 1, 4},
                {5, 5, 5, 5},
                {10}
        };

        for (int[] t : tests) {
            System.out.printf("%s → %b%n", java.util.Arrays.toString(t), scoresIncreasing(t));
        }
    }
}