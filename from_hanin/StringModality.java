public class StringModality {
    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        // Append substring from 0 to i for each i from 0 to str.length()
        for (int i = 0; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }
        // Return the final  string
        return result.toString();
    }
}
