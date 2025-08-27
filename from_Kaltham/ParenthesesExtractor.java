//Recursion-1 > parenBit

public class ParenthesesExtractor {
    public String getStringWithinParens(String str) {

        if (str.charAt(0) != ('(')) {
            return getStringWithinParens(str.substring(1));
        }
        if (str.charAt(str.length() - 1) != (')')) {
            return getStringWithinParens(str.substring(0, str.length() - 1));
        }

        return str;

    }
}