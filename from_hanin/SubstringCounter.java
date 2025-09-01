public class SubstringCounter {
    public boolean checkRepeats(String str, String sub, int n) {
        if (sub.length() > str.length()) {
            if (n <= 0) {
                return true;
            } else {
                return false;
            }
        } else {
            int len = sub.length();
            String first = str.substring(0, len);
            if (first.equals(sub)) {
                return checkRepeats(str.substring(1), sub, n - 1);
            } else {
                return checkRepeats(str.substring(1), sub, n);
            }
        }
    }

}
