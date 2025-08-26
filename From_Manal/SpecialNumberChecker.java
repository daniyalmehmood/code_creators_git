public class SpecialNumberChecker {
    //Check if the number is special
    public static boolean isSpecialNumber(int number) {
        //number is special if it is a multiple of 11 or if it is one more than a multiple of 11
        return (((number % 11) == 0) || ((number % 11) == 1));
    }
    public static void main(String[] args) {
        System.out.println(isSpecialNumber(22));
        System.out.println(isSpecialNumber(23));
        System.out.println(isSpecialNumber(24));
    }
}