public class CalculateRedTicketValue {
    public static void main(String[] args) {
        System.out.println(getRedTicketValue(2, 2, 2));// → 10
        System.out.println(getRedTicketValue(2, 2, 1));// → 0
        System.out.println(getRedTicketValue(0, 0, 0));// → 5
    }
    public static int getRedTicketValue(int a, int b, int c) {
        if(a == 2 && b == 2 && c == 2){
            return 10;
        }
        else if(a == b && b == c){
            return 5;
        }
        else if (c != a && b != a) {
            return 1;
        }
        return 0;
    }
}
