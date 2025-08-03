public class SubstringPairSelector {
    //Returns a substring of length 2 starting at the given index.
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}