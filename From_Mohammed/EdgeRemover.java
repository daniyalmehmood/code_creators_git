// Class for removing string edges
public class EdgeRemover {

    // Returns string without first and last char (if length >= 2)
    public String removeEdges(String str) {
        if (str.length() >= 2)
            return str.substring(1, str.length() - 1);
        return "";
    }
}
