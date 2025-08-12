public class StringSplosion {
    //Expand String by adding more than one character
    public static String expandString(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            r = r + str.substring(0, i + 1);
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(expandString("Code"));
        System.out.println(expandString("abc"));
        System.out.println(expandString("ab"));
    }
}