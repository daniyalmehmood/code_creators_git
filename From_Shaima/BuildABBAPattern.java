public class BuildABBAPattern {
    public static String makeABBA(String a, String b) {
        return a+b+b+a; // the output be the in the format of 'a' +'b'+'a'+'b'
    }
    public static void main(String[] args) {
        System.out.println(makeABBA("Hi", "Bye"));
        System.out.println(makeABBA("Yo", "Alice"));
        System.out.println(makeABBA("What", "Up"));
    }
}
