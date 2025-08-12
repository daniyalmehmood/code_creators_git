public class WithoutX {
    public String trimXEdges(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1 && str.equals("x")) {
            return "";
        }
        if (str.endsWith("x") && str.startsWith("x")) {
            return str.substring(1, str.length() - 1);
        }
        if (str.startsWith("x")) {
            return str.substring(1);
        }
        if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        }
        if (!str.endsWith("x") && !str.startsWith("x")) {
            return str;
        } else {
            return "";
        }
    }
}