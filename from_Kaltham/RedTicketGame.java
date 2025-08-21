//Logic-1 > redTicket

public class RedTicketGame {
    public int getRedTicketScore(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c && c == a) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }
}