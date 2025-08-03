public class LastChars {
    public static String lastChars(String a, String b) {
        char first = (a.length() >= 1) ? a.charAt(0) : '@';
        char last = (b.length() >= 1) ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }


public static void main(String[] args) {
    System.out.println(lastChars("last","chars"));
    System.out.println(lastChars("yo","java"));
    System.out.println(lastChars("hi",""));
}
}