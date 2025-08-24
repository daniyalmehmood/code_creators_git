public class StringRotator {

    /**
     * Moves the last 2 characters of the string to the front.
     * If the string has fewer than 2 characters, it returns the string unchanged.
     */
    public String rotateRight2(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
        return str;
    }
}
