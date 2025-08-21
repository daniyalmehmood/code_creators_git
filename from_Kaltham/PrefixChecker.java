public class PrefixChecker {
    public boolean containsPrefixAgain(String str, int n) {
        if (!str.isEmpty() && n < str.length()) {
            String prfixString = str.substring(0, n);
            if ((str.substring(n)).contains(prfixString)) {
                return true;
            }
        }
        return false;
    }
}