public class HelloMaker {
    public static String helloMaker(String name) {

        return "Hello " + name + "!";
    }

    public static void main(String[] args) {

        System.out.println(HelloMaker.helloMaker("Bob"));
        System.out.println(HelloMaker.helloMaker("Alice"));
        System.out.println(HelloMaker.helloMaker("X"));
        System.out.println(HelloMaker.helloMaker("Hello"));
    }

}
