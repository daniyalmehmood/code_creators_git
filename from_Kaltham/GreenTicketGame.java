//Logic-1 > greenTicket


public class GreenTicketGame {
    public int getGreenTicketScore(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || b == c || a == c) {
            return 10;
        }

        return 0;
    }
}