public class FrontOrBack {
    public static String frontOrBack(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }

        return str.substring(str.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(frontOrBack("Hello", true));
        System.out.println(frontOrBack("Hello", false));
        System.out.println(frontOrBack("oh", true));
        System.out.println(frontOrBack("oh", false));
        System.out.println(frontOrBack("java", true));
        System.out.println(frontOrBack("code", false));
    }
}