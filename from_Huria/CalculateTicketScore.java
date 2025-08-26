public class CalculateTicketScore {
    public static int calculateRedTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != c && a != b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(calculateRedTicket(2, 2, 2));
        System.out.println(calculateRedTicket(2, 2, 1));
        System.out.println(calculateRedTicket(0, 0, 0));
    }
}
