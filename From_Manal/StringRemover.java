public class StringRemover {
    // Method to remove all non-overlapping instances of removeString from baseString
    public static String removeSubstringIgnoreCase(String baseString, String removeString) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int removeLength = removeString.length();
        String lowerBase = baseString.toLowerCase();
        String lowerRemove = removeString.toLowerCase();
        while (i < baseString.length()) {
            if (i <= baseString.length() - removeLength &&
                    lowerBase.substring(i, i + removeLength).equals(lowerRemove)) {
                i += removeLength; 
            } else {
                result.append(baseString.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeSubstringIgnoreCase("Hello there", "llo"));
        System.out.println(removeSubstringIgnoreCase("Hello there", "e"));
        System.out.println(removeSubstringIgnoreCase("Hello there", "x"));
        System.out.println(removeSubstringIgnoreCase("xxx", "xx"));
    }
}