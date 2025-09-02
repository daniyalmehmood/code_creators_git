public class StringEndMatcher {
    public static String sameEnds(String string) {
        int len = string.length();
        String result = "";

        for (int i = 1; i <= len / 2; i++) {
            String start = string.substring(0, i);
            String end = string.substring(len - i);

            if (start.equals(end)) {
                result = start;
            }
        }

        return result;
    }

    public static void main(String arg[]){
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
}
}
