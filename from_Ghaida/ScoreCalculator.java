public class ScoreCalculator {//AP-1 > scoreUp
    public static void main(String[] args) {
        System.out.println(calculateScore(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"})); // → 6
        System.out.println(calculateScore(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));// → 11
        System.out.println(calculateScore(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));// → 16
    }
    public static int calculateScore(String[] key, String[] answers) {
        int totalScore = 0;
        for (int i = 0; i < key.length && i < answers.length; i++) {
            if (answers[i].equals("?")) {
                continue; // no change
            }
            else if (answers[i].equals(key[i])) {
                totalScore += 4;//example: if a == a
            }
            else {
                totalScore -= 1; //example: if a != a
            }
        }
        return totalScore;
    }
}