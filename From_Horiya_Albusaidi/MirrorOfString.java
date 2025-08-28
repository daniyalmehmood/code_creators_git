public class MirrorOfString {
    public static String checkTheMirrorEndIOfString(String string) {
        int index = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - index)) {
                index++;
            } else break;
        }
        return string.substring(0, index - 1);
    }
}
