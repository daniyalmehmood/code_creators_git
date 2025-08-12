public class WordMatcher {
    public static String getStartMatch(String str, String word) {
        // make sure the word length no longer thn str length
        if (word.length() <= str.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(getStartMatch("hippo", "hi") );
        System.out.println(getStartMatch("hippo", "xip"));
        System.out.println(getStartMatch("hippo", "i"));
    }
    }
