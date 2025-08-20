public class MaskExceptWord {
    public static String maskExceptWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i = i + (word.length() - 1);
            } else {
                result.append("+");
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {

        System.out.println(maskExceptWord("12xy34", "xy"));
        System.out.println(maskExceptWord("12xy34", "1"));
        System.out.println(maskExceptWord("12xy34xyabcxy", "xy"));
        System.out.println(maskExceptWord("--++ab", "++"));
    }
}
