public class NumbersOrderChecker {
    public static void main(String[] args) {
        System.out.println(checkOrder(1, 2, 4, false));// → true
        System.out.println(checkOrder(1, 2, 1, false));// → false
        System.out.println(checkOrder(1, 1, 2, true));// → true
    }
    public static boolean checkOrder(int a, int b, int c, boolean bOk) {
        if(bOk && c > b){
            return true;
        }
        return b > a && c > b;
    }
}
