public class FizzString {
    public static String fizzBuzzByEnds(String str) {
        if (str.charAt(str.length()-1)=='b'&& str.charAt(0)=='f'){
            return "FizzBuzz";
        } else if (str.charAt(0)=='f') {
            return "Fizz";
        } else if (str.charAt(str.length()-1)=='b') {
            return "Buzz";
        }
        return str;
    }

    public static void main(String[] args){
        System.out.println(fizzBuzzByEnds("fig"));
        System.out.println(fizzBuzzByEnds("dib"));
        System.out.println(fizzBuzzByEnds("fib"));
    }
}
