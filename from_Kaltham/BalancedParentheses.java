//Recursion-1 > nestParen

public class BalancedParentheses {
    public boolean isNestedCorrectly(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (str.charAt(0) == ('(') && str.charAt(str.length() - 1) == (')')) {
            return isNestedCorrectly(str.substring(1, str.length() - 1));

        }

        return false;
    }

}