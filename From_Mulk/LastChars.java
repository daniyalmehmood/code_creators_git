public class LastChars {
    public String combineFirstOfAAndLastOfB(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }
        if (a.length() == 0 && b.length() > 0) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.length() == 0 && a.length() > 0) {
            return a.substring(0, 1) + "@";

        } else {
            return "@@";
        }
    }
}