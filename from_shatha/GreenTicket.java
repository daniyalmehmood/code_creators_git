public class GreenTicket {
    public static int greenTicketScore(int a, int b, int c) {
        if (a!=b && a!=c && b!=c) {
            return 0;
        }
        else if (a==b && a==c && b==c) {
            return 20;
        } else {
            return 10;
        }
    }
    public static void main (String[] args){
        System.out.println(greenTicketScore(1,2,3));
        System.out.println(greenTicketScore(2,2,2));
        System.out.println(greenTicketScore(1,1,2));
    }

}
