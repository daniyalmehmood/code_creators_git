public class NestingParentheses {

    // Recursive function to check valid nesting
    public static boolean nestParen(String text) {
        // empty string is valid
        if (text.length() == 0) {
            return true;
        }

        //  odd length or single char cannot be valid
        if (text.length() == 1) {
            return false;
        }

        // Check first and last characters
        if (text.charAt(0) == '(' && text.charAt(text.length() - 1) == ')') {
            return nestParen(text.substring(1, text.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("nestParen(\"(())\") = " + nestParen("(())"));
        System.out.println("nestParen(\"((()))\") = " + nestParen("((()))"));
        System.out.println("nestParen(\"(((x))\") = " + nestParen("(((x))"));
    }
}