public class AllStarSeparator {

    // Recursive function to insert * between characters
    public static String allStar(String text) {
        // string of length 0 or 1 → return as is
        if (text.length() <= 1) {
            return text;
        }

        // first char + "*" + result of recursion on rest
        return text.charAt(0) + "*" + allStar(text.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("allStar(\"hello\") = " + allStar("hello")); 
        System.out.println("allStar(\"abc\") = " + allStar("abc"));    
        System.out.println("allStar(\"ab\") = " + allStar("ab"));       
    }
}