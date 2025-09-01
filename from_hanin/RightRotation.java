public class RightRotation {
    public String rotateRight2(String str) {
        // Check if the string has at least 2 characters
        if (str.length() >= 2) {
            // Take the last two characters and put them at the front,then append
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
        // Return original string if too short to rotate
        return str;
    }
}
