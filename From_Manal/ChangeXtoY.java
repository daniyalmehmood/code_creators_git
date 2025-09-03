public class ChangeXtoY {

    // Recursive function to replace 'x' with 'y'
    public static String changeXY(String text) {
        if (text.length() == 0) {
            return "";
        }

        char firstChar = text.charAt(0);

        if (firstChar == 'x') {
            // Replace 'x' with 'y' and continue recursion
            return 'y' + changeXY(text.substring(1));
        } else {
            // Keep character as is and continue recursion
            return firstChar + changeXY(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("changeXY(\"codex\") = " + changeXY("codex"));
        System.out.println("changeXY(\"xxhixx\") = " + changeXY("xxhixx"));
        System.out.println("changeXY(\"xhixhix\") = " + changeXY("xhixhix")); 
    }
}