public class NumberOrderChecker {
    public static void main(String[] args) {
        System.out.println(isInOrderOrEqual(2, 5, 11, false));// → true
        System.out.println(isInOrderOrEqual(5, 7, 6, false));// → false
        System.out.println(isInOrderOrEqual(5, 5, 7, true));// → true
    }
    public static boolean isInOrderOrEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk){
            return (c >= b && b >= a);
        }
        return (c > b && b > a);
    }
}
