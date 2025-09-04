//AP-1 > wordsWithoutList

import java.util.ArrayList;

public class WordsFilterByLength {
    public List filterByLength(String[]words, int len) {
        ArrayList < String > newArray = new ArrayList < String > ();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                newArray.add(words[i]);
            }
        }
        return newArray;
    }
}