public class XXCounter {
    public static int countDoubleX(String str) {
        int count = 0;
        // Loop through the string, stopping at second-to-last character
        for (int i = 0; i < str.length() - 1; i++) {
            // Check if the current and next characters form "xx"
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        // Return the total count of "xx" found
        return count;
    }
}
