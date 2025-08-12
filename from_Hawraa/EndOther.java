public class EndOther {
    public static boolean oneEndsWithOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() >= b.length()) {
           return a.substring(a.length()-b.length()).equals(b);
        }
        else {
            return b.substring(b.length()-a.length()).equals(a);
        }
    }

    public static void main(String[] args) {
        System.out.println(oneEndsWithOther("Hiabc", "abc"));
        System.out.println(oneEndsWithOther("AbC", "HiaBc"));
        System.out.println(oneEndsWithOther("abc", "abXabc"));
    }
}
