public class LastChars {
    public static String firstAndLast (String a, String b) {
        String firstChar = "@";
        String lastChar = "@";
        if (a.length() > 0) {
            firstChar = a.substring(0, 1);
        }
        if (b.length() > 0) {
            lastChar = b.substring(b.length() - 1);
        }
        return firstChar + lastChar;
    }

    public static void main(String[] args){
        System.out.println(firstAndLast ("last", "chars"));
        System.out.println(firstAndLast ("yo", "java"));
        System.out.println(firstAndLast ("hi", ""));
    }
}
