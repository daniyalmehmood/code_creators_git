public class LeftRotation {
    public String rotateLeft2(String str) {
        // Check if string has at least 2 characters
        if (str.length() >= 2) {
            // Take substring from index 2 to end + first two characters at the end
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }
}

