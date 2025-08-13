public class LessTwenty {
    public static boolean isNearMultipleOfTwenty(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public static void main(String[] args){
        System.out.println(isNearMultipleOfTwenty(18));
        System.out.println(isNearMultipleOfTwenty(19));
        System.out.println(isNearMultipleOfTwenty(20));
    }
}
