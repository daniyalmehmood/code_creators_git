//AP-1 > scoreUp

public class TestScorer {
    public int calculateScore(String[]key, String[]answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals(key[i])) {
                count += 4;
            } else if (answers[i].equals("?")) {
                count += 0;
            } else {
                count--;
            }
        }
        return count;
    }
}