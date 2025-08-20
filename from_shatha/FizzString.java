public class FizzString {
    public static String convertFizzBuzzString(String str) {
        if ((str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b'))  {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f'){
            return "Fizz";
        } else if ((str.charAt(str.length() - 1) == 'b'))  {
            return "Buzz";
        } else {
            return str;
        }
    }
        public static void main (String[] args){
            System.out.println(convertFizzBuzzString("fig"));
            System.out.println(convertFizzBuzzString("dib"));
            System.out.println(convertFizzBuzzString("fib"));
        }
}
