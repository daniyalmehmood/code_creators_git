public class PatternFinder {
    public int countCharPairs(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            if (str.charAt(0) == str.charAt(2)) {
                return 1 + countCharPairs(str.substring(1));
            } else {
                return 0 + countCharPairs(str.substring(1));
            }
        }
    }
}
