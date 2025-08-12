public class StringTimes {
    public static String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }
}
