public class StartWord {
        public static String startWord(String str, String word) {
            int wLen = word.length();
            if (str.length() < wLen) return "";

            if (str.substring(1, wLen).equals(word.substring(1))) {
                return str.substring(0, wLen);
            }
            return "";
        }

        public static void main(String[] args) {
            System.out.println(startWord("hippo", "hi"));  // hi
            System.out.println(startWord("hippo", "xip")); // hip
            System.out.println(startWord("hippo", "i"));   // h
        }
}
