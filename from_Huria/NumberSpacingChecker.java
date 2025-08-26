public class NumberSpacingChecker {
    public static boolean isEvenlySpaced(int a, int b, int c) {
        int minimum = Math.min(a, Math.min(b, c));
        int maximum = Math.max(a, Math.max(b, c));
        int middle = a + b + c - minimum - maximum;
        return (middle - minimum) == (maximum - middle);
    }

    public static void main(String[] args) {
        System.out.println(isEvenlySpaced(2, 4, 6));
        System.out.println(isEvenlySpaced(4, 6, 2));
        System.out.println(isEvenlySpaced(4, 6, 3));
    }
}
