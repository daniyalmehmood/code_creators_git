public class CalculateBlueTicketValue {
    public static void main(String[] args) {
        System.out.println(getBlueTicketValue(9, 1, 0));// → 10
        System.out.println(getBlueTicketValue(9, 2, 0));// → 0
        System.out.println(getBlueTicketValue(6, 1, 4));// → 10
    }
    public static int getBlueTicketValue(int a, int b, int c) {
        int sumOfAB = a +b;
        int sumOfAC = a +c;
        int sumOfBC = b +c;
        if(sumOfAB == 10 || sumOfBC == 10 || sumOfAC == 10){
            return 10;// First check if any pair sums to exactly 10
        }
        else if (sumOfAB - sumOfBC == 10 || sumOfAB - sumOfAC == 10) {
            return 5;// Then check if ab is exactly 10 more than bc or ac
        }
        return 0;
    }
}
