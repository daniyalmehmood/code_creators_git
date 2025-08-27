// Class for handling first characters
public class FirstCharHandler {

    // Returns first 2 chars, adds '@' if missing
    public String getAtFirst(String str) {
        if (str.length() < 1) return "@@";
        if (str.length() < 2) return str + "@";
        return str.substring(0, 2);
    }
}
