public class LoveSix {
    public static boolean isSixRelated(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    public static void main(String[] args) {
        System.out.println(isSixRelated(6, 4));
        System.out.println(isSixRelated(4, 5));
        System.out.println(isSixRelated(1, 5));
    }
}
