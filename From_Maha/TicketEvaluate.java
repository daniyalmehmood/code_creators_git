public class TicketEvaluate{
    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return 0;
        }
        if (a == b && b == c) {
            return 20;
        }
        return 10;
    }
}
