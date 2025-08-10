public class XYZMiddleChecker {
    public boolean isXYZInMiddle(String str) {
        if (str.length() >= 3) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                    String prfix = str.substring(0, i);
                    String sufix = str.substring(i + 3);
                    if (Math.abs(prfix.length() - sufix.length()) <= 1) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}