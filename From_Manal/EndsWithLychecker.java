public class EndsWithLychecker {
    public static boolean hasLyAtEnd(String str) {
        return str.endsWith("ly");
    }
    public static void main(String[] args) {
        System.out.println(hasLyAtEnd("oddly"));
        System.out.println(hasLyAtEnd("y") );
        System.out.println(hasLyAtEnd("oddy"));
    }
    }
