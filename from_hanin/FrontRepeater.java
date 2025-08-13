public class FrontRepeater {
    public static String frontTimes(String str, int n) {
        if (n >= 1) {
            int i;
            String result = "";

            // Get the first 3 characters, or the whole string if shorter
            String newstring = str.length() < 3 ? str : str.substring(0, 3);

            // Repeat string n times and append to result
            for (i = 0; i < n; i++) {
                result = result + newstring;
            }

            return result;
        }
        return "";
    }
}
