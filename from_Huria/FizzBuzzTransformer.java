public class FizzBuzzTransformer {
    public static String fizzBuzzTransformer(String str) {
        if((str.startsWith("f")) && (str.endsWith("b")) ) return "FizzBuzz" ;
        if(str.startsWith("f")) return "Fizz";
        if(str.endsWith("b")) return "Buzz" ;
        return str;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzzTransformer("fig"));
        System.out.println(fizzBuzzTransformer("dib"));
        System.out.println(fizzBuzzTransformer("fib"));
    }
}
