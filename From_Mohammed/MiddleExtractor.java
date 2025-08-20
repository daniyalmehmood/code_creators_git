// Class for extracting middle part of strings
public class MiddleExtractor {

    // Returns the middle two characters of the string
    public String getMiddleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }
}
