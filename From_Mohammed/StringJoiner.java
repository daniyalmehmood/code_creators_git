// Class for joining strings
public class StringJoiner {

    // Concatenates a and b, avoiding duplicate char if they overlap
    public String joinWithoutOverlap(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0))
            return a + b.substring(1);
        return a + b;
    }
}
