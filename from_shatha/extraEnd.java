public class extraEnd {
    public static String extraEnd(String str) {
        String copy = str.substring(str.length() - 2);
        return copy + copy + copy;
    }
public static void main(String[] args) {
    System.out.println(extraEnd("Hello"));
    System.out.println(extraEnd("ab"));
    System.out.println(extraEnd("Hi"));

}
}