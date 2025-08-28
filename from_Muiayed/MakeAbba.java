
    public class MakeAbba {
        public String makeAbba(String a, String b) {
            return a + b + b + a;
        }

        public static void main(String[] args) {
            MakeAbba m = new MakeAbba();
            System.out.println(m.makeAbba("Hi", "Bye"));
            System.out.println(m.makeAbba("Yo", "Alice"));
        }
    }
