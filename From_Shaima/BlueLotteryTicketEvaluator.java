public class BlueLotteryTicketEvaluator {
    public static int evaluateTicketResult(int a, int b, int c) {
        if (a+b == 10 || a+c==10 ||b+c==10)return 10; //If any pair sums to exactly 10, the result is 10
        if (a+b == 10+b+c||a+b == 10+a+c ||a+c == 10+b+c ||b+c == 10+a+c)return 5; //if the ab sum is exactly 10 more than either bc or ac sums, the result is 5
        return 0; //otherwise the result is 0
    }
    public static void main(String[] args) {
        System.out.println(evaluateTicketResult(9, 1, 0));
    }
}
