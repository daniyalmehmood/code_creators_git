public class StringEndChecker {
    public boolean endsWithOtherStringIgnoreCase(String a, String b) {
        String lowerOfa = a.toLowerCase();
        String lowerOfb = b.toLowerCase();
        if (lowerOfa.length() >= lowerOfb.length()) {
            return lowerOfa.substring(lowerOfa.length() - lowerOfb.length()).equals(lowerOfb);
        }
        if (lowerOfa.length() < lowerOfb.length()) {

            return lowerOfb.substring(lowerOfb.length() - lowerOfa.length()).equals(lowerOfa);
        }
        return false;
    }
}