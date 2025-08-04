public class LastTwoEndRepeator {
    public static String repeatLastTwoCharacterThreeTimes(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    public static void main(String[] args) {
        System.out.println(repeatLastTwoCharacterThreeTimes("Hello"));
        System.out.println(repeatLastTwoCharacterThreeTimes("ab"));
        System.out.println(repeatLastTwoCharacterThreeTimes("Hi"));
    }
}