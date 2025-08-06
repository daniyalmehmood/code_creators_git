public class RepeatSeparator {
    public static String repeatWithSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatWithSeparator("Word", "X", 3));
        System.out.println(repeatWithSeparator("This", "And", 2));
        System.out.println(repeatWithSeparator("This", "And", 1));
    }
}
