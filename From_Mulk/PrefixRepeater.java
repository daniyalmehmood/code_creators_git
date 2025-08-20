public class PrefixRepeater {
    public boolean hasRepeatingPrefixOfLength(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (n >= 1 && n <= str.length()) {
                if (str.substring(i, i + n).equals(prefix)) {
                    return true;

                }
            }
        }
        return false;
    }
}
