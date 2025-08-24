public class BadStringChecker {
   // Checks if the string contains "bad" starting at index 0 or 1.
// Returns true if "bad" is found in either position, otherwise false.
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.startsWith("bad")) {
            return true;
        } else if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
