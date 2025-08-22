public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        ComboString c = new ComboString();
        System.out.println(c.comboString("Hello", "hi"));
        System.out.println(c.comboString("hi", "Hello"));
        System.out.println(c.comboString("aaa", "b"));
    }
}