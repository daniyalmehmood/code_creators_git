public class LasttDigit {
    public static boolean isLastDigitSame(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static void main(String[] args){
        System.out.println(isLastDigitSame(23, 19, 13));
        System.out.println(isLastDigitSame(23, 19, 12));
        System.out.println(isLastDigitSame(23, 19, 3));
    }
}
