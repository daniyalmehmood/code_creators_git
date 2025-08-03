public class StringMatch {
    public int countMatchingPairs(String a, String b) {
        int countX = 0;
        int mid = Math.min(a.length(), b.length());
        for (int i = 0; i < mid - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                countX++;
            }
        }
        return countX;
    }
}