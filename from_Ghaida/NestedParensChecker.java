public class NestedParensChecker {//Recursion-1 > nestParen
    public static void main(String[] args) {
        System.out.println(hasValidParens("(())"));// true
        System.out.println(hasValidParens("((()))"));// true
        System.out.println(hasValidParens("(((x))"));// false
    }
    public static boolean hasValidParens(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return hasValidParens(str.substring(1, str.length() - 1));
        }
        return false;
    }
}