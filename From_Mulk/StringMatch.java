public class StringMatch {
    public int countMatchingPairs(String a, String b) {
        int count = 0;
        int middle = Math.min(a.length(), b.length());
        for (int i = 0; i < middle - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
}