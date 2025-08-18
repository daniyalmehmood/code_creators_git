public class MirrorEnds {
    public static String matchingEndsSegment(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                result.append(string.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(matchingEndsSegment("abXYZba"));
        System.out.println(matchingEndsSegment("abca"));
        System.out.println(matchingEndsSegment("aba"));
    }
}