// Class for extracting two characters
public class TwoCharExtractor {

    // Returns 2 chars from given index, or first 2 if index is invalid
    public String getTwoChars(String str, int index) {
        if (index < 0 || index + 1 >= str.length())
            return str.substring(0, 2);
        return str.substring(index, index + 2);
    }
}
