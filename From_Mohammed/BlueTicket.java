public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int sumAB= a+b;
        int sumBC= b+c;
        int sumAC= a+c;
        if ( sumAB==10 || sumBC==10 || sumAC==10 ) return 10;
        if ( sumAB==10+sumBC || sumAB==10+sumAC  ) return 5;
        return 0;
    }
}
