public class RotateLeft2 {
    public static String rotateLeft2(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            String first = str.substring(0, 2);
            String second = str.substring(2, str.length());
            String newString = second + first;
            return newString;
        }
    }

    public static void main(String[] args) {
        System.out.println(RotateLeft2.rotateLeft2("Hello"));
        System.out.println(RotateLeft2.rotateLeft2("java"));
        System.out.println(RotateLeft2.rotateLeft2("Hi"));
        System.out.println(RotateLeft2.rotateLeft2("Chocolate"));
        System.out.println(RotateLeft2.rotateLeft2("12345"));

    }
}
