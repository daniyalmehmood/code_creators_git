public class NearTenChecker {
    public static boolean isNearMultipleOfTen(int num) {
        int reminder = num % 10;
        return (reminder <=2 || reminder >=8 );
    }
    public static void main(String[] args) {
        System.out.println(isNearMultipleOfTen(12));
        System.out.println(isNearMultipleOfTen(17));
        System.out.println(isNearMultipleOfTen(19));
    }
    }
