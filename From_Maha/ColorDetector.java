public class ColorDetector {
    public String detectColorPrefix(String str) {
        if (str.length() >= 3 && str.startsWith("red")) {
            return "red";
        } else if (str.length() >= 4 && str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
