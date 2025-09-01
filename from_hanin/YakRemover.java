public class YakRemover {
    public static String stringYak(String str) {
        // Create  input string
        StringBuilder newString = new StringBuilder(str);

        // pass  through the string
        for (int i = 0; i < newString.length() - 1; ) {
            // Check if the current 3-character substring is "yak"
            if (newString.substring(i, i + 3).equals("yak")) {
                // If yes, remove it
                newString.delete(i, i + 3);
                // Do not increment i, in case another "yak" starts at this position after deletion
            } else {
                // Otherwise, move to the next character
                i++;
            }
        }

        // Return the modified string
        return newString.toString();
    }
}


