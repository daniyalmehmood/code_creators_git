public class EndRepeater {
    public static String repeatEnd(String str, int n) {
        StringBuilder repeatedVal = new StringBuilder();
        if (!str.isEmpty() && n >= 0) if (str.length() > 2) {
            for (int i = 0; i < n; i++) {
                repeatedVal.append(str, str.length() - n, str.length());
            }
        } else for (int i = 0; i < n; i++) {
            repeatedVal.append(str, 0, str.length());
        }
        return repeatedVal.toString();
    }

    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
        System.out.println(repeatEnd("", 0));
        System.out.println(repeatEnd("abc", 3));
        System.out.println(repeatEnd("Hello", 0));
    }
}