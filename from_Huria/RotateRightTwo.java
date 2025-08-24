public class RotateRightTwo {
    public static String rotateRightTwo(String str) {
        if (str.length() <= 2) {
            return str;
        } else {

            String lastIndex = str.substring(str.length() - 2);
            return lastIndex + str.substring(0, str.length() - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(rotateRightTwo("java"));
        System.out.println(rotateRightTwo("Hello"));
        System.out.println(rotateRightTwo("code"));
        System.out.println(rotateRightTwo("12345"));
        System.out.println(rotateRightTwo("cat"));
        System.out.println(rotateRightTwo(""));
    }
}