public class SubstringExtractor {
    public String getFirstAndLastNChars(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

}
