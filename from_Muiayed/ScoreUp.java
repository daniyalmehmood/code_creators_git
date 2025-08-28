public class ScoreUp {
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if ("?".equals(answers[i])) continue;
            if (key[i].equals(answers[i])) score += 4;
            else score -= 1;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(scoreUp(new String[]{"a","a","b","b"}, new String[]{"a","c","b","c"}));
        System.out.println(scoreUp(new String[]{"a","a","b","b"}, new String[]{"a","a","b","c"}));
        System.out.println(scoreUp(new String[]{"a","a","b","b"}, new String[]{"a","a","b","b"}));
    }
}