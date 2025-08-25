public class StringEndRepeater {
    public String extraEnd(String str) {
        // Check if the string has at least 2 characters
        if (str.length() >= 2) {
            // Get the last 2 characters
            String newString = str.substring(str.length() - 2);
            // Repeat the substring 3 times and return
            return newString + newString + newString;
        }

        // If the string has fewer than 2 characters, return it as-is
        return str;
    }
}

