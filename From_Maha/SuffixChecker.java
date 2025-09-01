public class SuffixChecker {
    public boolean endsWithOtherString(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int aLength = a.length();
        int bLength = b.length();
        if (aLength >= bLength) {
            return b.equals(a.substring(aLength - bLength, aLength));
        }
        if (bLength >= aLength) {
            return a.equals(b.substring(bLength - aLength, bLength));
        }
        return false;
    }
}
