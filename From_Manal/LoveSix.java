public class LoveSix {
    public static boolean isLoveSix(int a, int b) {
        return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6;
    }
    public static void main(String[] args) {
        System.out.println(isLoveSix(6, 4));  // true
        System.out.println(isLoveSix(4, 2));  // false
        System.out.println(isLoveSix(1, 5));  // true
        System.out.println(isLoveSix(12, 6)); // true
    }
}