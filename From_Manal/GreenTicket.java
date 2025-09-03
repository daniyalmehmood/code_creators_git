public class GreenTicket {
    public static int getPrize(int a, int b, int c) {
        if (a == b && b == c) return 20;
        if (a == b || b == c || c == a) return 10;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getPrize(1, 2, 3));
        System.out.println(getPrize(2, 2, 2));
        System.out.println(getPrize(1, 1, 2));
    }
}
