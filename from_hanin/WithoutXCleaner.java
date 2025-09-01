public class WithoutXCleaner {
    public static String withoutX(String str) {
        // Get the first character and last character  of the string
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1);

        //  remove both  If first and last characters are 'x',
        if (last.equals("x") && first.equals("x")) {
            return str.substring(1, str.length() - 1);
        }
        // If only the last character is 'x', remove it
        if (last.equals("x")) {
            return str.substring(0, str.length() - 1);
        }
        // If only the first character is 'x', remove it
        if (first.equals("x")) {
            return str.substring(1, str.length());
        }
        return str;
    }

}
