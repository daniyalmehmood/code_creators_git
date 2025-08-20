public class RedTicket {
    public static int redTicketScore(int a, int b, int c) {
        if (a == 2 && b==2 && c==2) {
            return 10;
        }
        else if (a==b && a==c && b==c) {
            return 5;
        } else if(a!=b && a!=c){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main (String[] args){
        System.out.println(redTicketScore(2,2,2));
        System.out.println(redTicketScore(2,2,1));
        System.out.println(redTicketScore(0,0,0));
    }

}

