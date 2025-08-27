// AP-1 > wordsWithout
public class WordsWithoutTarget {
    public String[] removeTargetString(String[] words, String target) {
        int arrayLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                arrayLength++;
            }
        }

        String[] result = new String[words.length - arrayLength];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[index] = words[i];
                index++;
            }
        }
        return result;
    }
}