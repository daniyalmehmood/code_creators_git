public class ToEdgeRemover {
    public static String withoutEnd(String str) {
        // Check if the string has at least 2 characters
        if (str.length() >= 2) {
            // Return without first and last characters
            return str.substring(1, str.length() - 1);
        }
        // return the string
        return str;
    }
}

