public class BlueLotteryTickets {
    public int checkBlueTicketsSumValues(int a, int b, int c) {
        int sumAB = a + b;
        int sumBC = b + c;
        int sumAC = a + c;
        if (sumAB == 10 || sumBC == 10 || sumAC == 10) return 10;
        else if ((sumAB - sumBC) == 10 || (sumAB - sumAC) == 10) return 5;
        else return 0;
    }

}
