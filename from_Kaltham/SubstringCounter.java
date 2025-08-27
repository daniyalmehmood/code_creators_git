//Recursion-1 > strCount

public class SubstringCounter {
    public int countSubstrings(String str, String sub) {
        int lengthOfSub = sub.length();
        if (!
            str.isEmpty()) {
            if (str.length() < lengthOfSub) {
                return 0;
            }
            if (str.substring(0, lengthOfSub).equals(sub)) {
                return 1 + countSubstrings(str.substring(lengthOfSub), sub);
            } else {
                return countSubstrings(str.substring(1), sub);
            }
        }
        return 0;
    }
}