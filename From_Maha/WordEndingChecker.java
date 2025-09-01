//String-3 > countYZ
public class WordEndingChecker {
    public int countYZ(String str) {
        str = str.toLowerCase();
        // split by any non character
        String[] words = str.split("[^a-z]+");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = word.charAt(word.length() - 1);
                if (lastChar == 'y' || lastChar == 'z') {
                    count++;
                }
            }
        }
        return count;
    }
}

