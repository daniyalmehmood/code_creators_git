public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY")); //"c13i"
        System.out.println(wordEnds("XY123XY", "XY")); //"13"
        System.out.println(wordEnds("XY1XY", "XY")); //"11"
    }
    public static String wordEnds(String str, String word) {
        if(word.length() <= 0){
            return str;
        }
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.startsWith(word, i)){
                if (i > 0) {
                    newString.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {// Append char after the word
                    newString.append(str.charAt(i + word.length()));
                }
                i += word.length() - 1;// Move index forward by the length of word
            }
        }
        return newString.toString();
    }
}
