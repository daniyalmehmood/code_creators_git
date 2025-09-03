//AP-1 > wordsWithout
public class WordRemover {
    public String[] removeTargetWord(String[] words, String target) {
        int size = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                size++;
            }
        }

        String[] result = new String[size];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals(target))) {
                result[index] = words[i];
                index++;

            }
        }
        return result;
    }

}
