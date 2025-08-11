public class StringPatternCounter {

    /**
     * Counts how many times the last 2 characters of the string
     * appear elsewhere in the string, not including the last occurrence.
     */
    
    public int countEndingPairMatches(String str) {

        if (str.length() < 2) {
            return 0; // Not enough characters to form a 2-char pattern
        }

        int count = 0;
        String lastTwo = str.substring(str.length() - 2); // The pattern to search for

        // Loop through the string, excluding the final 2 characters
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(lastTwo)) {
                count++;
            }
        }

        return count;
    }
}
