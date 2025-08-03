public class StringWithoutStart {
    public String nonStart(String a, String b) {
        // Check if both strings have at least one character
        if (a.length() >= 1 && b.length() >= 1) {
            // Return concatenation of substrings excluding first characters
            return a.substring(1) + b.substring(1);
        }
        // If either string is empty, return 'a' as fallback
        return a;
    }
}


