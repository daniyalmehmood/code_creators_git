public class RedTicket {

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c)           return 5;
        if (a != b && a != c)           return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2)); // 10
        System.out.println(redTicket(2, 2, 1)); // 0
        System.out.println(redTicket(0, 0, 0)); // 5
    }
}