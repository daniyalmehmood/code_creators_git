//String-3 > notReplace
public class StringModifier {
    public String insertNotAfterIs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                boolean leftOk = (i == 0) || !Character.isLetter(str.charAt(i - 1));
                boolean rightOk = (i + 2 == str.length()) || !Character.isLetter(str.charAt(i + 2));
                if (leftOk && rightOk) {
                    result.append("is not");
                    i += 1;
                    continue;
                }
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
