public class WithoutEnd {
    public String removeEdgeCharacters(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }
}





