// Class for repeating parts of strings
public class StringNTwice {

    // Returns first n chars + last n chars of the string
    public String takeNTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
