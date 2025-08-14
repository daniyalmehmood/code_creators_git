public class BlueTicket {
    public static int getBlueTicketResult(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || ac == 10 || bc == 10) {
            return 10;
        } else if (ab == ac + 10 || ab == bc + 10) {
            return 5;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getBlueTicketResult(9, 1, 0));
        System.out.println(getBlueTicketResult(9, 2, 0));
        System.out.println(getBlueTicketResult(6, 1, 4));
    }
}
