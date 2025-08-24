public class WordRepeatedWithSeparator {
    public static String wordRepeatedWithSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        if (count <= 0) {
            return "";
        }
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(wordRepeatedWithSeparator("Word", "X", 3));
        System.out.println(wordRepeatedWithSeparator("This", "And", 2));
        System.out.println(wordRepeatedWithSeparator("This", "And", 1));
        System.out.println(wordRepeatedWithSeparator("AAA", "", 0));
        System.out.println(wordRepeatedWithSeparator("abc", "XX", 1));
    }
}