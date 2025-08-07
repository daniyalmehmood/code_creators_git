public class RotateLeftTwo {
    public static String rotateLeftTwo(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            String first = str.substring(0, 2);
            String second = str.substring(2);
            return second + first;
        }
    }

    public static void main(String[] args) {
        System.out.println(rotateLeftTwo("Hello"));
        System.out.println(rotateLeftTwo("java"));
        System.out.println(rotateLeftTwo("Hi"));
        System.out.println(rotateLeftTwo("Chocolate"));
        System.out.println(rotateLeftTwo("12345"));

    }
}
