// Class for handling last and first characters
public class LastFirstHandler {

    // Returns first char of 'a' and last char of 'b', uses '@' if missing
    public String getLastChars(String a, String b) {
        if ((a.length() < 1) && (b.length() < 1)) return "@" + "@";
        if (a.length() < 1) return "@" + b.substring(b.length() - 1);
        if (b.length() < 1) return a.substring(0, 1) + "@";

        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
}
