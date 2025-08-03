public class SkipFirstChars {
    public static String skipFirstChars(String a, String b) {
        String newString = a.substring(1, a.length()) + b.substring(1, b.length());

        return newString;
    }

    public static void main(String[] args) {

        System.out.println(SkipFirstChars.skipFirstChars("Hello", "There"));
        System.out.println(SkipFirstChars.skipFirstChars("java", "code"));
        System.out.println(SkipFirstChars.skipFirstChars("ab", "xy"));
        System.out.println(SkipFirstChars.skipFirstChars("a", "x"));
        System.out.println(SkipFirstChars.skipFirstChars("x", "ac"));
        System.out.println(SkipFirstChars.skipFirstChars("mart", "dart"));
    }
}