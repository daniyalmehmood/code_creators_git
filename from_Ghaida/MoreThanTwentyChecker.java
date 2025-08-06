public class MoreThanTwentyChecker {
    public static void main(String[] args) {
        System.out.println(isOffsetByOneOrTwo(20));// → false
        System.out.println(isOffsetByOneOrTwo(21));// → true
        System.out.println(isOffsetByOneOrTwo(22));// → true
    }
    public static boolean isOffsetByOneOrTwo(int n) {
        int reminder = n % 20;
        if(reminder == 1 || reminder == 2){
            return true;
        }
        return false;
    }
}
