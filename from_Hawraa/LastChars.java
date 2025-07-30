public class LastChars {
    public static String lastChars(String a, String b) {
        String firstChar;
        String lastChar;
        if (a.length() > 0) {
            firstChar = a.substring(0, 1);
        }
        else {
            firstChar = "@";
        }
        if (b.length() > 0) {
            lastChar = b.substring(b.length() - 1);
        }
        else {
            lastChar = "@";
        }
        return firstChar + lastChar;
    }

    public static void main(String[] args){
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }
}
