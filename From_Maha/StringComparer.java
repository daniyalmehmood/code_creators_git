public class StringComparer {

   // Counts the number of positions where two strings contain the same two-character substring.

   //return the number of matching 2-character substrings at the same positions

    public int stringMatch(String a, String b) {
        int count = 0;
        int bound = Math.min(a.length(), b.length());

        for (int i = 0; i < bound - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }
}
