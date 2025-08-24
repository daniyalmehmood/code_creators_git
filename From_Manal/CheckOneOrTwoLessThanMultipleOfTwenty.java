public class CheckOneOrTwoLessThanMultipleOfTwenty {
    public static boolean isOneOrTwoLessThanMultipleOfTwenty(int number){
        return (number % 20 == 18 || number % 20 == 19);
    }
    public static void main(String[] args) {
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(18));
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(19));
        System.out.println(isOneOrTwoLessThanMultipleOfTwenty(20));
    }
}