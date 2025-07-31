public class ComboString {
    public static void main(String[] args){
        System.out.println(comboString("Hello", "hi")); // "hiHellohi"
        System.out.println(comboString("hi", "Hello")); // "hiHellohi"
        System.out.println(comboString("aaa", "b")); // "baaab"
    }
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }
}
