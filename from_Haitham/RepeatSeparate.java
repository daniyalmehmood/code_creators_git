public class RepeatSeparate {
   public String repeatSeparator(String word, String sep, int count) {
        if (count < 1) return "";
        StringBuilder newString = new StringBuilder(word);
        for (int i = 0; i < count - 1; i++) {
            newString.append(sep);
            newString.append(word);
        }
        return newString.toString();
    }
	}