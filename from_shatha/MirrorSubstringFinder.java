public class MirrorSubstringFinder {
    public static String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result.append(string.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
    public static void main(String arg[]){
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }
}
