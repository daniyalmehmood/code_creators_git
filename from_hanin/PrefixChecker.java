public class PrefixChecker {

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        // Search for the prefix starting at index n (after the initial prefix)
        return str.indexOf(prefix, n) != -1;
    }

}
