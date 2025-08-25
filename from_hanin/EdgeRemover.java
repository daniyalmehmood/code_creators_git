public class EdgeRemover {
    public String withoutEnd(String str) {
        // Check if the string has at least 2 characters
        if (str.length() >= 2) {
            // Return substring from index 1 up to (but not including) the last character
            return str.substring(1, str.length() - 1);
        }

        // For strings shorter than 2 characters, return the original string
        return str;
    }
}

