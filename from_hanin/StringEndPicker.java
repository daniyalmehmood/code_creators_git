public class StringEndPicker {
    public String theEnd(String str, boolean front) {
        if (str != null && !str.isEmpty()) {
            if (front) {
                // Return the first character
                return str.substring(0, 1);
            } else {
                // Return the last character
                return str.substring(str.length() - 1);
            }
        }
        return str;
    }
}



