public class ZPPatternReducer {
    public static String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                // Skip this character (middle of "z?p")
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

}

