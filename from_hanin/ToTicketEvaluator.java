public class ToTicketEvaluator {
    public int evaluateGreenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        //If the numbers are all different from each other, the result is 0
        else if (a != b && b != c && a != c) {
            return 0;
        } else {
            return 10;
        }
    }
}


