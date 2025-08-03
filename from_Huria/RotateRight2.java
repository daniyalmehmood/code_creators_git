public class RotateRight2 {
    public static String rotateRight2(String str) {
        if (str.length() <= 2) {
            return str;
        } else {

            String end = str.substring(str.length() - 2, str.length());
            String newString = end + str.substring(0, str.length() - 2);

            return newString;
        }
    }

    public static void main(String[] args) {

        System.out.println(RotateRight2.rotateRight2("java"));
        System.out.println(RotateRight2.rotateRight2("Hello"));
        System.out.println(RotateRight2.rotateRight2("code"));
        System.out.println(RotateRight2.rotateRight2("12345"));
        System.out.println(RotateRight2.rotateRight2("cat"));
        System.out.println(RotateRight2.rotateRight2(""));
    }
}