public class TicketEvaluator {
    public int redTicket(int a, int b, int c) {
        if (a == b && a == c) {
            if (a == 2) {
                return 10;
            }
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }
}
