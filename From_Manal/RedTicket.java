public class RedTicket{
    public static int grtPrize(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a ==b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(grtPrize(2, 2, 2) );
        System.out.println(grtPrize(2, 2, 1) );
        System.out.println(grtPrize(0, 0, 0) );
    }
}