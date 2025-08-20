public class BlueTicket {
    public static int blueTicketScore(int a, int b, int c) {
        int ab=a+b;
        int ac=a+c;
        int bc=b+c;

        if (ab==10 || ac==10 || bc==10) {
            return 10;
        }
        else if (ab==bc+10 || ab==ac+10) {
            return 5;
        } else {
            return 0;
        }
    }
    public static void main (String[] args){
        System.out.println(blueTicketScore(9,1,0));
        System.out.println(blueTicketScore(9,2,0));
        System.out.println(blueTicketScore(6,1,4));
    }

}