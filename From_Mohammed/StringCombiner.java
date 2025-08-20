// Class for combining strings
public class StringCombiner {

    // Returns shorter+longer+shorter string
    public String combineStrings(String a, String b) {
        if (a.length() < b.length()) return a + b + a;
        return b + a + b;
    }
}
