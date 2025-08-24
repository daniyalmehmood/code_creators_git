public class RedLotteryTicketEvaluator {
    public static int evaluateTicketValue(int a, int b, int c) {
        if (a==2 && b==2 && c==2)return 10; //return 10 while all are 2
        if (a==b && b==c)return 5; // return 5 while all are equals
        if (a!=b && a!=c)return 1; // return 1 if b and c not equal to a
        return 0; // otherwise return 0
    }
    public static void main(String[] args){
        System.out.println(evaluateTicketValue(2,2,2));
        System.out.println(evaluateTicketValue(2,2,0));
    }
}
