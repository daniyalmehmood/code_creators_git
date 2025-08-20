public class SeparatedWordRepeater {
    public String repeatWithSeparator(String word, String sep, int count) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            newString.append(word);
            if (i < count - 1) {
                newString.append(sep);
            }
        }

        return newString.toString();
    }
}




