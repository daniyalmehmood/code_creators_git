public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() >= b.length()) {
            int lengthOfA = a.length() - b.length();
            return a.substring(lengthOfA) + b;
        }
        if (a.length() <= b.length()) {
            int lengthOfb = b.length() - a.length();
            return a + b.substring(lengthOfb);
        }
        return "";

    }
}