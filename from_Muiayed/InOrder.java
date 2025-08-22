public class InOrder {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk && b <= a) return false;
        return c > b;
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false)); // true
        System.out.println(inOrder(1, 2, 1, false)); // false
        System.out.println(inOrder(1, 1, 2, true));  // true
    }
}