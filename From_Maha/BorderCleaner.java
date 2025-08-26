public class BorderCleaner {
    public String cleanXBorders(String text) {
        if (text.isEmpty()) {
            return text;
        }
        if (text.startsWith("x")) {
            text = text.substring(1);
        }
        if (text.endsWith("x")) {
            text = text.substring(0, text.length() - 1);
        }
        return text;
    }
}
