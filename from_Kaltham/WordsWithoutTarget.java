//AP-1 > wordsWithout

public class WordsWithoutTarget {
    public String[]removeTargetWord(String[]words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                count++;
            }
        }
        String[]newArray = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                newArray[index] = words[i];
                index++;
            }
        }
        return newArray;
    }
}