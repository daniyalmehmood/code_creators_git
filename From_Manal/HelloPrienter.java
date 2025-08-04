public class HelloPrienter {
    public static String prientHelloAtBeginning(String name) {
        return "Hello " + name + "!";
    }
    public static void main(String[] arg) {
        System.out.println(prientHelloAtBeginning("Bob"));
        System.out.println(prientHelloAtBeginning("Alice"));
        System.out.println(prientHelloAtBeginning("X"));
    }
}