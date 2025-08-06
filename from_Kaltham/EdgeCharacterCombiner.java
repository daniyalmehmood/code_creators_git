public class EdgeCharacterCombiner {
    public String joinFirstAndLast(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        }
        if (a.isEmpty()) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.isEmpty()) {
            return a.substring(0, 1) + "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);

    }
}