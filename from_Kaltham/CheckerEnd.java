public class CheckerEnd {
    public boolean isEndsMatch(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        if (a.length() > b.length()) {
            if (a1.substring(a1.length() - b.length()).equals(b1.substring(0))) {
                return true;
            }
        } else {
            if (b1.substring(b.length() - a.length()).equals(a1.substring(0))) {
                return true;
            }
        }

        return false;
    }
}