public class MoreThanMultipleOfTwenty {
    public static boolean isOneOrTwoMoreThanMultipleOfTwenty(int number) {
        return (number % 20 == 1 || number % 20 == 2);
    }
    public static void main(String[] args) {
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(20));
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(21));
        System.out.println(isOneOrTwoMoreThanMultipleOfTwenty(22));
    }
}
