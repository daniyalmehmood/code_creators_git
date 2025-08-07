public class ConCat {
    public static String concatNoDoubleChar(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }

        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            b = b.substring(1);
        }

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(concatNoDoubleChar("abc", "cat"));
        System.out.println(concatNoDoubleChar("dog", "cat"));
        System.out.println(concatNoDoubleChar("abc", ""));
    }
}