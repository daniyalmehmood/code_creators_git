public class GreenTicket {
    public static int getGreenTicketResult(int a, int b, int c) {
        if (a == b && b == c){
            return 20;
        } else if (a == b || b == c || a == c){
            return 10;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(getGreenTicketResult(1, 2, 3));
        System.out.println(getGreenTicketResult(2, 2, 2));
        System.out.println(getGreenTicketResult(1, 1, 2) );
    }
}
