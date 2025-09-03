public class GreenTicketScoreCalculator {
    public static int greenTicketScoreCalculator(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == c || a == b || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(greenTicketScoreCalculator(1, 2, 3));
        System.out.println(greenTicketScoreCalculator(2, 2, 2));
        System.out.println(greenTicketScoreCalculator(1, 1, 2));
    }
}
