public class SameEnds {
    public static String beginSameEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length() / 2; i++) {
            String start = string.substring(0, i + 1);
            String end = string.substring(string.length() - i - 1);
            if (start.equals(end)) {
                result = start;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(beginSameEnds("abXYab"));
        System.out.println(beginSameEnds("xx"));
        System.out.println(beginSameEnds("xxx"));
    }
}
