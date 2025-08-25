public class NearMultipleOfTenChecker {
    public static boolean multipleOfTenChecker(int num) {
        int reminder = num%10;
        if (num%10 ==0 || num%10 ==1 || num%10 == 2 || num%10 == 8 || num%10 == 9 ) {
            return true;
        }
        return false;
    }
    public  static void main(String[] args) {
        System.out.println(multipleOfTenChecker(18));
    }
}
