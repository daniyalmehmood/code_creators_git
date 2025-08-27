// Class for trimming strings
public class StringTrimmer {

    // Returns the string without the first and last character
    public String removeEnds(String str) {
        return str.substring(1, str.length() - 1);
    }
}
