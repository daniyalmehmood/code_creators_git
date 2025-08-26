public class CloseAndFarChecker {
    public static void main(String[] args) {
        System.out.println(isCloseAndFar(1, 2, 10));// → true
        System.out.println(isCloseAndFar(1, 2, 3));// → false
        System.out.println(isCloseAndFar(4, 1, 3));// → true
    }
    public static boolean isCloseAndFar(int a, int b, int c) {
        int abClose = Math.abs(a - b);
        int acClose = Math.abs(a - c);
        int bcClose = Math.abs(b - c);
        return ((abClose <= 1 && acClose >= 2 && bcClose >= 2) || (acClose <= 1 && bcClose >= 2 && abClose >= 2) || (bcClose <= 1 && abClose >= 2 && acClose >= 2));
    }
}

