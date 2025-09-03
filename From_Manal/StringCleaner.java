public class StringCleaner {

    // Recursive function to remove adjacent duplicates
    public static String stringClean(String text) {
        // empty or single character string
        if (text.length() <= 1) {
            return text;
        }

        // If first two characters are the same, skip the first
        if (text.charAt(0) == text.charAt(1)) {
            return stringClean(text.substring(1));
        } else {
            // Keep first character + clean the rest
            return text.charAt(0) + stringClean(text.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("stringClean(\"yyzzza\") = " + stringClean("yyzzza")); 
        System.out.println("stringClean(\"abbbcdd\") = " + stringClean("abbbcdd"));
        System.out.println("stringClean(\"Hello\") = " + stringClean("Hello"));     
    }
}