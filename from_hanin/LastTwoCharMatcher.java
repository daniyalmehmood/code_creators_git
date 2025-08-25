public class LastTwoCharMatcher {
    public static int countMatchingLastTwo(String str) {
        // If string length is less than 2
        if (str.length() < 2) return 0;

        int count = 0;
        // Get the last two characters to match against
        String lastTwo = str.substring(str.length() - 2);

        // Loop through the string up to the last two characters
        for (int i = 0; i < str.length() - 2; i++) {
            String currentPair = str.substring(i, i + 2);
            // Check if current pair equals the last two characters
            if (currentPair.equals(lastTwo)) {
                count++;
            }
        }

        return count;
    }
}
