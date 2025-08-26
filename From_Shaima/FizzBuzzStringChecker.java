public class FizzBuzzStringChecker {
    public static String fizzBuzzTransformer(String str) {
        if (str.charAt(0)=='f' && str.charAt(str.length()-1)=='b' ) return "FizzBuzz"; // return "FizzBuzz" the 'str' is started with 'f' and end with 'b'
        if (str.charAt(0)=='f')return "Fizz"; // return "Fizz" the 'str' is started with 'f'
        if (str.charAt(str.length()-1)=='b')return "Buzz"; // return "Buzz" the 'str' is ends with 'b'
        return str; // otherwise return 'str'
    }
    public static void main(String[] args){
        System.out.println(fizzBuzzTransformer("fig"));
    }
}
