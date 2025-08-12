public class FirstLastMerger {
    public String extractNFromEnds(String str, int n) {

        return str.substring(0, n) + str.substring(str.length() - n);

    }
}