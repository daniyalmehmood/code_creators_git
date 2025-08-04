public class CombineFirstAndLast {
    public static String getFirstOfAAndLastOfB(String a, String b) {
        //use '@' if a is empty, otherwise take first character
        String firstChar = a.length() >= 1 ? a.substring(0, 1) : "@";
        //use '@' if b is empty, otherwise take last character
        String lastChar = b.length() >= 1 ? b.substring(b.length()-1) : "@";
        return firstChar + lastChar;
    }
    public static void main(String[] args) {
        System.out.println(getFirstOfAAndLastOfB("last", "chars") );
        System.out.println(getFirstOfAAndLastOfB("yo", "java"));
        System.out.println(getFirstOfAAndLastOfB("hi", ""));
    }
}
