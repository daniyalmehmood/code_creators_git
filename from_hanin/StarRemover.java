public class StarRemover {
    public static String cleanStars(String str) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*') || (i < str.length() - 1 && str.charAt(i + 1) == '*')) {

                newWord.append(str.charAt(i));
            }
        }
        return newWord.toString();
    }
}



