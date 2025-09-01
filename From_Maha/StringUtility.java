public class StringUtility {
    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String firstPart = str.substring(0, n - i);
            result.append(firstPart);
        }
        return result.toString();
    }
}
