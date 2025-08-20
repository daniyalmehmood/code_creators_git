public class ReplaceIsWithIsNot {
    public String replaceIsWithIsNot(String str) {
        StringBuilder result = new StringBuilder(" ");
        result.append(str);
        result.append(" ");
        for (int i = 0; i < result.length() - 2; i++) {
            if (result.substring(i, i + 2).equals("is") &&
                ((!Character.isLetter(result.charAt(i - 1)) &&
                        (!Character.isLetter(result.charAt(i + 2)))))) {
                result = result.replace(i, i + 2, "is not");
            }
        }
        return result.toString().trim();
    }
}