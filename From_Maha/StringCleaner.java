public class StringCleaner {

    // Removes all 'x' characters from the middle of the string,
    // but keeps any 'x' characters at the start or end intact.
    public String removeInnerX(String str) {

        if (str.length() <= 2) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        StringBuilder result = new StringBuilder();

        result.append(firstChar); // preserve first character

        // Loop through the middle characters only
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result.append(str.charAt(i));
            }
        }

        result.append(lastChar); // preserve last character

        return result.toString();
    }
}
