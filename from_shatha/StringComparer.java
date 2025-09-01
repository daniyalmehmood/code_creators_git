public class StringComparer {
    public static boolean endsWithIgnoreCase(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

public static void main (String[]args){
    System.out.println(endsWithIgnoreCase("Hiabc", "abc"));
    System.out.println(endsWithIgnoreCase("AbC", "HiaBc"));
    System.out.println(endsWithIgnoreCase("abc", "abXabc"));
}
}
