public class IsOneOrTwoMoreThanMultipleOfTwenty {
    public static boolean isOneOrTwoMoreThanMultipleOfTwenty(int n) {
        if(n%20 == 1 || n%20==2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(20));
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(21));
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(22));
    }
}
