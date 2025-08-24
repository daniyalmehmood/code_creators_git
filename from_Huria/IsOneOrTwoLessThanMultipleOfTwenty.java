public class IsOneOrTwoLessThanMultipleOfTwenty {
    public static boolean isOneOrTwoLessThanMultipleOfTwenty(int n) {
        if(n%20 ==18 || n%20==19){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(18));
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(19));
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(20));
    }
}
