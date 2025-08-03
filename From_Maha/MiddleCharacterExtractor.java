public class MiddleCharacterExtractor {
     // Returns the middle two characters of a string with even length.
    // If the string length is 2 or less, returns the original string.
    public String getMiddleTwoChars(String str) {
        if (str.length() > 2) {
            int mid = str.length() / 2;
            return str.substring(mid - 1, mid + 1);
        } else {
            return str;
        }
    }
}

