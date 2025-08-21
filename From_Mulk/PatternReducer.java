public class PatternReducer {
    public String removeMiddleCharInZXP(String str) {
        StringBuilder newString = new StringBuilder(str);
        for (int i = 0; i <= str.length() - 3; i++) {
            if (newString.charAt(i) == 'z' && newString.charAt(i + 2) == 'p') {
                newString.deleteCharAt(i + 1);
            }
        }
        return newString.toString();
    }
}