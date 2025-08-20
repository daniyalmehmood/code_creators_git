public class XyBalanceChecker {
    public boolean hasBalancedXyCharacters(String str) {
        int countx = 0;
        int county = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                county++;
            }
            if (str.charAt(i) == 'x') {
                if (county == 0) {
                    return false;
                }
                countx++;
            }
        }

        return true;
    }
}