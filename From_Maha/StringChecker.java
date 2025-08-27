class StringChecker {
    public boolean hasXyzInMiddle(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                int right = str.length() - (i + 3);
                if (Math.abs(i - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
