public class StringMirror {
    public static String stringMirror(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {

        System.out.println(StringMirror.stringMirror("Hi", "Bye"));
        System.out.println(StringMirror.stringMirror("Yo", "Alice"));
        System.out.println(StringMirror.stringMirror("Hi", "Bye"));
        System.out.println(StringMirror.stringMirror("What", "Up"));
        System.out.println(StringMirror.stringMirror("", "y"));
        System.out.println(StringMirror.stringMirror("x", ""));
        System.out.println(StringMirror.stringMirror("x", "y"));
        System.out.println(StringMirror.stringMirror("Bo", "Ya"));
    }
}