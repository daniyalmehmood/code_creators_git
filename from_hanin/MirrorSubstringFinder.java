public class MirrorSubstringFinder {
    public static String findMirrorEnds(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result += string.charAt(i);  // accumulate the matching characters
            } else {
                break;  // stop if characters don't match
            }
        }

        return result;
    }
}