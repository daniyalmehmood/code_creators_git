public class StringEndingChecker {
    public  boolean isEndingMatch(String a, String b) {
        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if either string ends with the other
        if (a.endsWith(b) || b.endsWith(a)) {
            return true;
        }
        return false;
    }

}
