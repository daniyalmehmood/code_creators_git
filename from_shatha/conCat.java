public class conCat {
    public static String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }

        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            b = b.substring(1);
        }

        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }
}