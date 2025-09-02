//AP-1 > wordsWithoutList

import java.util.ArrayList;
import java.util.List;

public class MissingWords {
    public List filterOutWordsOfLength(String[] words, int len) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len)
                list.add(words[i]);
        }
        return list;
    }

}