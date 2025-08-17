public class BlueTicket {

    public int evaluateBlueTicketScore(int a, int b, int c) {
        int sumAB = a+b;
        int sumAC = a+c;
        int sumBC = c+b;

        if (sumAB == 10 || sumAC ==10 || sumBC==10) return 10;
        if (sumAB >= 10 && (a>10 || b>10)) return 5;
        return 0;

    }

}
