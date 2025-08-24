// Class for detecting "bad" in strings
public class BadDetector {

    // Returns true if "bad" appears at index 0 or 1
    public boolean containsBadAtStart(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("bad")) ||
                (str.length() >= 4 && str.substring(1, 4).equals("bad"));
    }
}
