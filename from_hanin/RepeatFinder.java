public class RepeatFinder {
    public int countSubstrings(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        else {
            int len = sub.length();
            String first = str.substring(0, len);
            if (first.equals(sub)) {
                return 1 + countSubstrings(str.substring(len), sub);
            } else {
                return countSubstrings(str.substring(1), sub);
            }
        }
    }

}

