public class XYBalancedChecker {
    public boolean isXYBalanced(String str) {
        boolean foundY = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'y') {
                foundY = true;
            }
            if (str.charAt(i) == 'x') {
                if (!foundY) {
                    return false;
                }
            }
        }
        return true;
    }
}