public class GreenTicket {
    public int greenTicketScore(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a != b && b != c && c != a) {
            return 0;
        }
        return 10;
    }
}
