public class extraFront {
    public static String repeatFirstTwo(String str) {
        String letter;
        if (str.length() >= 2) {
           letter = str.substring(0, 2);
        }else {
            letter = str;
        }
        return letter+letter+letter;
    }
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }
}
