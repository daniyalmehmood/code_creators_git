public class StringTimes {
    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);

        }
        return result.toString();
    }
    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hi", 0));
        System.out.println(stringTimes("Hi", 5));
        System.out.println(stringTimes("x", 4));

    }
}
