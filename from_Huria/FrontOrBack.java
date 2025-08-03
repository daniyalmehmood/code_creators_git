public class FrontOrBack {
    public static String frontOrBack(String str, boolean front) {

        String newStr = "";
        if (front == true) {
            return newStr = str.substring(0, 1);
        }

        return newStr = str.substring(str.length() - 1, str.length());
    }

    public static void main(String[] args) {

        System.out.println(frontOrBack("Hello", true));
        System.out.println(frontOrBack("Hello", false));
        System.out.println(frontOrBack("oh", true));
        System.out.println(frontOrBack("oh", false));
        System.out.println(frontOrBack("java", true));
        System.out.println(frontOrBack("code", false));
        System.out.println(frontOrBack("code", false));
    }
}