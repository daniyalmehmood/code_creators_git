public class WordMatch {
    public static int countMatchingSubstrings(String a, String b) {
        // Find the smaller length between the two strings
        int str = Math.min(a.length(), b.length());
        int count = 0;
        // Loop through each string
        for (int i = 0; i < str - 1; i++) {
            String firstSub = a.substring(i, i + 2);
            String secondSub = b.substring(i, i + 2);
            // Check if the substrings are equal
            if (firstSub.equals(secondSub)) {
                count++;
            }
        }

        return count;
    }
}

