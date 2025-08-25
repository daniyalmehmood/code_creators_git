public class PlusOut {
    public String plusAdder(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - word.length() && str.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append('+');
                i++;
            }
        }
        return result.toString();
    }
	}