public class StringPrefixSuffixChecker {
    public static void main(String[] args) {
        System.out.println(convertToFizzBuzzString("fig"));// → "Fizz"
        System.out.println(convertToFizzBuzzString("dib"));// → "Buzz"
        System.out.println(convertToFizzBuzzString("fib"));// → "FizzBuzz"
    }
    public static String convertToFizzBuzzString(String str) {
         if (str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') {
            return "FizzBuzz";
        }
        else if(str.charAt(0) == 'f'){
            return "Fizz";
        } else if (str.charAt(str.length()-1) == 'b') {
            return "Buzz";
        }
        return str;
    }
}
