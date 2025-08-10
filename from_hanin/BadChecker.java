public class BadChecker {
    public static boolean startsWithBad(String str) {
        // Check if the string has at least 3 characters and starts with "bad"
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }

        // Check if the string has at least 4 characters and have "bad"
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
