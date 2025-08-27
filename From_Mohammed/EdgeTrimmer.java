// Class for removing matching start and end
public class EdgeTrimmer {

    // Removes first 2 chars if they match last 2, else returns original
    public String trimMatchingEdges(String str) {
        if (str.length() < 1 || str.length() == 2) return "";
        if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2, str.length());
        return str;
    }
}
