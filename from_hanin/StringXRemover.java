public class StringXRemover {
    // Method to remove 'x' characters from the middle of the string (preserving the first and last character)
    public static String removeMiddleX(String str) {
        // StringBuilder to build the result for the middle characters
        StringBuilder str1 = new StringBuilder();

        // Loop through the string, excluding the first and last characters
        for (int i = 1; i < str.length() - 1; i++) {
            // Append the character if it is not 'x'
            if (str.charAt(i) != 'x')
                str1.append(str.charAt(i));
        }

        //  return: first character + filtered middle part + last character
        return str.substring(0, 1) + str1.toString() + str.substring(str.length() - 1);
    }
}
