public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isLastDigitSame(23, 19, 13));// → true
        System.out.println(isLastDigitSame(23, 19, 12));// → false
        System.out.println(isLastDigitSame(23, 19, 3));// → true
    }
    public static boolean isLastDigitSame(int a, int b, int c) {
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        int lastDigitOfC = c % 10;
        return (lastDigitOfA == lastDigitOfB || lastDigitOfA == lastDigitOfC || lastDigitOfB == lastDigitOfC);
    }
}