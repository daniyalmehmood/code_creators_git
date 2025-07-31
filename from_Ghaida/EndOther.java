public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); //true
        System.out.println(endOther("AbC", "HiaBc")); //true
        System.out.println(endOther("abc", "abXabc")); //true
    }
    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if(a.endsWith(b)){
                return true;
            }
            else if(b.endsWith(a)){
                return true;
            }
        }
        return false;
    }
}
