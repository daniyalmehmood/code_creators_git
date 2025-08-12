public class BlueTicketEvaluator {
        public int evaluateBlueTicket(int a, int b, int c) {
            int ab = a + b;
            int bc = b + c;
            int ac = a + c;
            //If any pair sums to exactly 10, the result is 10
            if (ab == 10 || bc == 10 || ac == 10) {
                return 10;
            } else if (ab == bc + 10 || ab == ac + 10) {
                return 5;
            } else {
                return 0;
            }
        }
    }

