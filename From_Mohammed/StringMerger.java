// Class for string operations
public class StringMerger {

    // Returns both strings without their first character
    public String mergeWithoutFirst(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }
}
