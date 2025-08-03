public class StringCombiner {
    public String comboString(String a, String b) {
        // Check for non-null inputs
        if (a != null && b != null) {
            // If 'a' is longer than 'b', return b+a+b
            if (a.length() > b.length()) {
                return b + a + b;
            }
            // If 'b' is longer than 'a', return a+b+a
            if (a.length() < b.length()) {
                return a + b + a;
            }
        }
        // Return null if any input is null or lengths are equal
        return null;
    }
}
