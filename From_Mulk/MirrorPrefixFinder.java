public class MirrorPrefixFinder {
    public String longestMirrorPrefix(String string) {

        for (int i = 0; i < string.length(); i++) {
            char Front = string.charAt(i);
            char End = string.charAt(string.length() - 1 - i);
            if (Front != End) {
                return string.substring(0, i);
            }
        }
        return string;
    }
}