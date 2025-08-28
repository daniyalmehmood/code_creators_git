public class DividesSelf {
    public static boolean dividesSelf(int n) {
        int t = n;
        while (t > 0) {
            int d = t % 10;
            if (d == 0 || n % d != 0) return false;
            t /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(dividesSelf(128));
        System.out.println(dividesSelf(12));
        System.out.println(dividesSelf(120));
    }
}