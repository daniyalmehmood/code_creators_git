public class HelloName {
        public String helloName(String name) {
            return "Hello " + name + "!";
        }

        public static void main(String[] args) {
            HelloName h = new HelloName();
            System.out.println(h.helloName("Bob"));
            System.out.println(h.helloName("Alice"));
        }
    }
