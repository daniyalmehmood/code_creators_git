public class FirstAndLastN {
    public static String firstAndLastN(String str, int n) {
        String result = str.substring(0, n) + str.substring(str.length() - n);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(firstAndLastN("Hello", 2));
        System.out.println(firstAndLastN("Chocolate", 3));
        System.out.println(firstAndLastN("Chocolate", 1));
        System.out.println(firstAndLastN("", 1));
    }
}
