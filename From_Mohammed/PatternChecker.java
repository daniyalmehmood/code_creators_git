// Class for checking string patterns
public class PatternChecker {

    // Returns true if first 2 and last 2 chars are the same
    public boolean hasSameStartEnd(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return true;
        return false;
    }
}
