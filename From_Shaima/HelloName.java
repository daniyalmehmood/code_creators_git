public class HelloName {
    public static String printHelloName(String name) {
        return "Hello"+" "+ name + "!"; // return "Hello" with the input 'name' and "!"
    }
    public static void main(String[] args) {
        System.out.println(printHelloName("Bob"));
        System.out.println(printHelloName("X"));
    }
}
