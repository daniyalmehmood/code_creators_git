// Class for extracting middle characters
public class MiddleThreeExtractor {

    // Returns the middle three characters of the string
    public String getMiddleThree(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }
}
