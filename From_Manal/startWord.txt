public class StartWord {
    public static String startWord(String str, String word) {
        if (word.length() <= str.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi") );
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }

    }
