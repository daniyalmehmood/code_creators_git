public class EndOther {
    public boolean endOther(String a, String b) {
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        return s1.endsWith(s2) || s2.endsWith(s1);
    }

    public static void main(String[] args) {
        EndOther eo = new EndOther();
        System.out.println(eo.endOther("Hiabc", "abc"));
        System.out.println(eo.endOther("AbC", "HiaBc"));
        System.out.println(eo.endOther("abc", "abXabc"));
        System.out.println(eo.endOther("abc", "abXab"));
    }
}