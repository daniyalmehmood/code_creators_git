// Class for handling string beginnings
public class StringStart {

    // Returns the first 2 characters of the string (or the whole string if shorter)
    public String getFirstTwo(String str) {
        if (str.length() > 2) return str.substring(0, 2);
        if (str.length() <= 2) return str;
        return "";
    }
}
