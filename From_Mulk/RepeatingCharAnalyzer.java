public class RepeatingCharAnalyzer {
    public int maxRepeatingCharSequence(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int max = 0;
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            char character = str.charAt(i);
            char brevious = str.charAt(i + 1);

            if (character == brevious) {
                count++;
                max = Math.max(max, count);
            } else {
                max = Math.max(max, count);
                count = 1;
            }


        }
        return max;
    }
}