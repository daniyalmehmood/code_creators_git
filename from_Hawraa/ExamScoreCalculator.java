// AP-1 > scoreUp
public class ExamScoreCalculator {
    public int calculateScore(String[] key, String[] answers) {
        int correctAnswer = 0;
        for (int i = 0; i <= key.length - 1; i++) {
            if (answers[i].equals(key[i])) {
                correctAnswer += 4;
            } else if (answers[i].equals("?")) {
                correctAnswer += 0;
            } else {
                correctAnswer -= 1;
            }
        }
        return correctAnswer;
    }
}