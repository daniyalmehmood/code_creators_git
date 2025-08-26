public class EvenSpacingChecker {
    public static void main(String[] args) {
        System.out.println(areEvenlySpaced(2, 4, 6);
        System.out.println(areEvenlySpaced(4, 6, 2);
        System.out.println(areEvenlySpaced(4, 6, 3);
    }
    public static boolean areEvenlySpaced(int a, int b, int c) {
        return (a - b == b - c || a - c == c - b || b - c == c - a || b - a == a - c);
    }
}
