public class ExtraEnd {
    public static String repeatEndThreeTimes(String str) {
        String copy = str.substring(str.length() - 2);
        return copy + copy + copy;
    }
public static void main(String[] args) {
    System.out.println(repeatEndThreeTimes("Hello"));
    System.out.println(repeatEndThreeTimes("ab"));
    System.out.println(repeatEndThreeTimes("Hi"));

}
}