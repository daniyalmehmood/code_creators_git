public class GChecker {
    public boolean isGHasNeighborG(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (!(i < str.length() - 1 && str.charAt(i + 1) == 'g') &&
                    !(i > 0 && str.charAt(i - 1) == 'g')) {
                    return false;
                }
            }
        }
        return true;
    }
}