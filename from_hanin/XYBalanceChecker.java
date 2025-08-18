public class XYBalanceChecker {
    public boolean isXYBalanced(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                return true;
            }
            if (str.charAt(i) == 'x') return false;

        }
        return true;

    }


}
