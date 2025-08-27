// Class for extracting characters
public class CharExtractor {

    // Returns first character if front=true, else last character
    public String getEndChar(String str, boolean front) {
        if (front) return str.substring(0, 1);
        return str.substring(str.length() - 1);
    }
}
