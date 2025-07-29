public class StringRepeater {
    public static String repeateString(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(repeateString("Hi", 2));
        System.out.println(repeateString("Hi", 3));
        System.out.println(repeateString("Hi", 1));
    }
}