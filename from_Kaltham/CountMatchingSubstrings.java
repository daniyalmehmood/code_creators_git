public class CountMatchingSubstrings {
    public int countMatchingSubstrings(String a, String b) {
        int count = 0;
        int lenght = Math.min(a.length(), b.length());
        for (int i = 0; i < lenght - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
}