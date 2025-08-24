public class MultipleOfThreeOrFiveChecker {
    public static boolean multipleOfThreeOrFiveChecker(int n) {
        if((n%3 == 0 && n%5 != 0)|| (n%5==0&& n%3 != 0)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {

        System.out.println(multipleOfThreeOrFiveChecker( 3));
        System.out.println(multipleOfThreeOrFiveChecker( 10));
        System.out.println(multipleOfThreeOrFiveChecker( 15));
    }
}
