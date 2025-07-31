public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi")); //"hi"
        System.out.println(startWord("hippo", "xip")); //"hip"
        System.out.println(startWord("hippo", "i")); //"h"
    }
    public static String startWord(String str, String word) {
        if(word.length() > str.length()){
            return "";
        }
        if(str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        return "";
    }
}
