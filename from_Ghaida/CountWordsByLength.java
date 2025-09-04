public class CountWordsByLength {//AP-1 > wordsCount

    public static void main(String[] args) {
        System.out.println(countMatchingLength(new String[]{"a", "bb", "b", "ccc"}, 1)); // → 2
        System.out.println(countMatchingLength(new String[]{"a", "bb", "b", "ccc"}, 3)); // → 1
        System.out.println(countMatchingLength(new String[]{"a", "bb", "b", "ccc"}, 4)); // → 0
    }
    public static int countMatchingLength(String[] words, int len) {
        int matchingLengthCount = 0;
        for (String word : words) {
            if(word.length() == len){
                matchingLengthCount++;
            }
        }
        return matchingLengthCount;
    }
}