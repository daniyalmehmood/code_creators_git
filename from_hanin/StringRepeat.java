public class StringRepeat {
    public String repeatEndingSegment(String str, int n) {
        StringBuilder results = new StringBuilder();
        String endWord = str.substring(str.length()-n);
        for (int i = 0; i < n; i++) {
            results.append(endWord);

        }

        return results.toString();
    }

}

