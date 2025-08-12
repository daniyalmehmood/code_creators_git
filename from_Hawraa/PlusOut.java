public class PlusOut {
    public static String replaceCharsExceptWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceCharsExceptWord("12xy34", "xy"));
        System.out.println(replaceCharsExceptWord("12xy34", "1"));
        System.out.println(replaceCharsExceptWord("12xy34xyabcxy", "xy"));
    }
}
