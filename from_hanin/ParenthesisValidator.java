public class ParenthesisValidator {
    public boolean checkNestedParens(String str) {
        if (str.length() == 0) {
            return true;
        }

        if (str.length() == 1) {
            return false;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar == '(' && lastChar == ')') {
            return checkNestedParens(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}

