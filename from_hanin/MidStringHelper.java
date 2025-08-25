public class MidStringHelper {
    public String getCentralThree(String str) {
        // Check if string length is at least 2
        if (str.length() >= 2) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
        // Return original string if length less than 2
        return str;
    }
}

