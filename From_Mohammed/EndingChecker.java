// Class for checking string endings
public class EndingChecker {

    // Returns true if the string ends with "ly"
    public boolean hasLyEnding(String str) {
        if (str.length() >= 2 && str.endsWith("ly")) return true;
        return false;
    }
}
