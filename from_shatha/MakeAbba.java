public class MakeAbba {
    public static String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);

    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Bye"));
        System.out.println(makeAbba("What", "Up"));
    }
}