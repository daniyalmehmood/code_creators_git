// Class for word matching at string start
public class WordStarter {

    // Returns starting part of str if it matches word (ignoring first char)
    public String getStartWord(String str, String word) {
        if (str.length() >= word.length() &&
                str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
