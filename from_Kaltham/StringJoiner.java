public class StringJoiner {
    public String mergeAvoidingOverlap(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "";
        }
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b.substring(0);

        }
        return a + b;

    }
}