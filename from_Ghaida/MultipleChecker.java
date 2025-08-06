public class MultipleChecker {
    public static void main(String[] args) {
        System.out.println(isExclusiveMultiple(3));// → true
        System.out.println(isExclusiveMultiple(10));// → true
        System.out.println(isExclusiveMultiple(15));// → false
    }
    public static boolean isExclusiveMultiple(int n) {
        if(n % 3 ==0 && n % 5 == 0){
            return false;
        }
        return (n % 3 ==0 || n % 5 == 0);
    }
}
