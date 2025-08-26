public class CalculateGreenTicketValue {
    public static void main(String[] args) {
        System.out.println(getGreenTicketValue(1, 2, 3));// → 0
        System.out.println(getGreenTicketValue(2, 2, 2));// → 20
        System.out.println(getGreenTicketValue(1, 1, 2));// → 10
    }
    public static int getGreenTicketValue(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        }
        else if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }
}
