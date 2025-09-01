public class MiddleTwo {
    // Method to return the middle two characters of the input string
    public String getMiddleOfTwo(String str) {
        // Assumes str is non-null and has even length ≥ 2
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
