//String-2 > zipZap
public class ZipZapProcessor {
    /**
     * Processes the input string by finding any pattern "z?p"
     * (where '?' is any character) and simplifies it to "zp".
     */
    public String simplifyZipZapPattern(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > i + 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
