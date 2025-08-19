// Class for inserting words inside wrappers
public class WordWrapper {

    // Inserts a word into the given outer string
    public String insertWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
