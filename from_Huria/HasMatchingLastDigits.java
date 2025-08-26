public class HasMatchingLastDigits {
    public static boolean hasMatchingLastDigits(int a, int b, int c) {
        if (a % 10 == c % 10 || a % 10 == b % 10 || b % 10 == c % 10) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingLastDigits(23, 19, 13));
        System.out.println(hasMatchingLastDigits(23, 19, 12));
        System.out.println(hasMatchingLastDigits(23, 19, 3));
    }
}
