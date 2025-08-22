public class FizzString {

    public static String fizzString(String str) {
        boolean startsF = str.startsWith("f");
        boolean endsB   = str.endsWith("b");

        if (startsF && endsB)   return "FizzBuzz";
        if (startsF)            return "Fizz";
        if (endsB)              return "Buzz";
        return str;
    }

    public static void main(String[] args) {
        System.out.println(fizzString("fig")); // Fizz
        System.out.println(fizzString("dib")); // Buzz
        System.out.println(fizzString("fib")); // FizzBuzz
        System.out.println(fizzString("hello")); // hello
    }
}