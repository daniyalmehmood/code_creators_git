public class More20 {

    public static boolean more20(int n) {
        int r = n % 20;
        return r == 1 || r == 2;
    }

    public static void main(String[] args) {
        System.out.println(more20(20)); // false
        System.out.println(more20(21)); // true
        System.out.println(more20(22)); // true
    }
}