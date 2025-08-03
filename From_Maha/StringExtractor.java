public class StringExtractor {

    //  Constructs a new string by taking pairs of characters starting at every 4th index.
    // return a new string composed of selected character pairs

    public String extractAlternatePairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int min = Math.min(i + 2, str.length());
            result += str.substring(i, min);
        }
        return result;
    }
}
