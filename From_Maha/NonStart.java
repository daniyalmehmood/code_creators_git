public class StringJoiner {

    /**
     * Returns a new string made by removing the first character from both input strings
     * and concatenating the results.
     */
    public String combineWithoutFirstChar(String a, String b) {
        String aSub = a.substring(1, a.length());
        String bSub = b.substring(1, b.length());
        return aSub + bSub;
    }
}
