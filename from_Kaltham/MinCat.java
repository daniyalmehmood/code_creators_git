public class MinCat {
    public String concatEqualEnds(String a, String b) {
        if (a.length() >= b.length()) {
            int lengthOfA = a.length() - b.length();
            return a.substring(lengthOfA) + b;
        }
        if (a.length() <= b.length()) {
            int lengthOfB = b.length() - a.length();
            return a + b.substring(lengthOfB);
        }
        return "";

    }
}