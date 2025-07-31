public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz")); //"axbycz"
        System.out.println(mixString("Hi", "There")); //"HTihere"
        System.out.println(mixString("xxxx", "There")); //"xTxhxexre"
    }
    public static String mixString(String a, String b) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                newString.append(a.charAt(i));
            }
            if (i < b.length()) {
                newString.append(b.charAt(i));
            }
        }
        return newString.toString();
    }
}
