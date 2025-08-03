public class StartWord{
public String startWord(String str, String word) {
        if (word.isEmpty())
            return "";
        String matchTheWord;
        if (str.length() >= word.length()) {
            matchTheWord = str.substring(1, word.length());
            if (matchTheWord.equals(word.substring(1)))
                return str.substring(0, word.length());
        }
        return "";
    }
	}