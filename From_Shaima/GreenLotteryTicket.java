public class GreenLotteryTicket {
    public static int greenTicketScoreCalculator(int a, int b, int c) {
        if (a==b && b==c) return 20;
        if (a==b || a==c || b==c) return 10;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(greenTicketScoreCalculator(1,2,3));
    }
}
