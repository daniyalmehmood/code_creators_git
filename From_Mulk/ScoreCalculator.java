//AP-1 > scoreUp
public class ScoreCalculator {
    public int calculateTestScore(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            }
            if (!key[i].equals(answers[i]) && !answers[i].equals("?")) {
                score += -1;
            }
            if (answers[i].equals("?")) {
                score += 0;
            }
        }
        return score;
    }
}