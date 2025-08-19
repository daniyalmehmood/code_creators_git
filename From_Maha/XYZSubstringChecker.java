public class XYZSubstringChecker {
    public boolean containsXYZNotPrecededByDot(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("xyz", i)) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
