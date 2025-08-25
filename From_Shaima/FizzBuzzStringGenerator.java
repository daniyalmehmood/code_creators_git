public class FizzBuzzStringGenerator {
    public static  String fizzBuzzFormatter(int n) {
        if (n%3==0 && n%5==0) return "FizzBuzz!";
        if (n%3==0) return "Fizz!";
        if (n%5==0) return "Buzz!";
        return n+"!";
    }
    public  static void main(String[] args) {
        System.out.println(fizzBuzzFormatter(3));
    }
}
