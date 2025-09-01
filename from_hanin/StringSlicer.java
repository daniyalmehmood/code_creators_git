public class StringSlicer {

    public String getTwoChar(String str, int index) {
        // Check for null input, string too short, or invalid index
        if (str == null || str.length() < 2) {
            return str;
        }

        // Check if index is within valid range to extract 2 characters
        if (index >= 0 && index <= str.length() - 2) {
            return str.substring(index, index + 2);
        }

        // Default case: return the first 2 characters
        return str.substring(0, 2);
    }
}
