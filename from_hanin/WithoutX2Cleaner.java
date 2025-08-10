public class WithoutX2Cleaner {
    public static String withoutX2(String str) {
        // Get the first and second  character of the string
        String first = str.substring(0, 1);
        String second = str.substring(1, 2);

        // If both the first and second characters are 'x', remove both
        if (second.equals("x") && first.equals("x")) {
            return str.substring(2, str.length());
        }
        // If only the second character is 'x', remove it
        if (second.equals("x")) {
            return first + str.substring(2, str.length());
        }
        // If only the first character is 'x', remove it
        if (first.equals("x")) {
            return str.substring(1, str.length());
        }


        return str;
    }

}
