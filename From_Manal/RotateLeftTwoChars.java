public class RotateLeftTwoChars {
    public static String rotateLeftTwoChars(String str) {
        return str.substring(2)+ str.substring(0,2);
    }
    public static void main(String[] args) {
        System.out.println(rotateLeftTwoChars("Hello"));
        System.out.println(rotateLeftTwoChars("java"));
        System.out.println(rotateLeftTwoChars("Hi") );
    }
}
