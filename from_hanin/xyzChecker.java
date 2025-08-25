public class xyzChecker {
    public boolean hasXYZWithoutDot(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            // Check for "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // Check if it's not preceded by a dot
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }

}
