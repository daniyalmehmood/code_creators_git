public class CharExtractor {
    public String getEndChar(String str, boolean front) {
        if (!str.isEmpty()) {
            if (front) {
                return str.substring(0, 1);
            }
            return (str.substring(str.length() - 1));
        }
        return "String is Empty";
    }

}