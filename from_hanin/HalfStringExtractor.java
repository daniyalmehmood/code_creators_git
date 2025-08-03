public class HalfStringExtractor {
    public String getFirstHalf(String str) {
        // Extracts the substring from the beginning up to the halfway point (exclusive)
        return str.substring(0, str.length() / 2);
    }
}
