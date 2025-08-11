public class StringRepeater {

    /**
     * Creates a new string by repeating the first three characters (or fewer if the string is shorter)
     * of the input string n times.
     */
    public String frontTimes(String str, int n) {
        String result = "";
        int strLength = Math.min(3, str.length()); // Take up to first 3 characters
        String strFront = str.substring(0, strLength);

        for (int i = 0; i < n; i++) {
            result = result + strFront;
        }
        return result;
    }
}
