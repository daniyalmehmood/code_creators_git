public class BracketContent {
    public static String getParenSubstring(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar == '(' && lastChar == ')') {
            return str;
        } else if (firstChar == '(' && lastChar != ')') {
            return getParenSubstring(str.substring(0, str.length() - 1));
        } else if (firstChar != '(' && lastChar == ')') {
            return getParenSubstring(str.substring(1));
        } else {
            return getParenSubstring(str.substring(1, str.length() - 1));
        }
    }


}

