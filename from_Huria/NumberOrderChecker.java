public class NumberOrderChecker {
    public static boolean numberInOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (b < c) return true;
        } else {
            if (a < b && b < c) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(numberInOrder(1, 2, 4, false));
        System.out.println(numberInOrder(1, 2, 1, false));
        System.out.println(numberInOrder(1, 1, 2, true));
    }
}
