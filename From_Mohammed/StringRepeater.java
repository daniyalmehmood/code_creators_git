// Class for repeating string parts
public class StringRepeater {

    // Returns last 2 characters repeated 3 times
    public String repeatLastTwo(String str) {
        return str.substring(str.length() - 2)
                + str.substring(str.length() - 2)
                + str.substring(str.length() - 2);
    }
}
